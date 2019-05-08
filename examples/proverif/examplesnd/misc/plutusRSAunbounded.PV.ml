
param verboseRules = true.

(** crypto equations *) 

fun e/2.
fun d/2.
fun N/1.
fun skey/2.
fun vkey/2.
fun sign/2.
fun enc/2.
private fun key/1.

fun crack/3.
equation crack(e(sk,lkey),d(sk,lkey),N(sk)) = sk.

reduc signKey(d(sk,lkey),N(sk)) = skey(sk,lkey).

reduc verifyKey(e(sk,lkey),N(sk)) = vkey(sk,lkey).

fun modulus/1.
equation modulus(v) = N(key(v)).

reduc verify(sign(x,skey(sk,lkey)),vkey(sk,lkey)) = x.

fun pubKey/2.
equation pubKey(lkey,N(sk)) = e(sk,lkey).

fun dec/2.
equation dec(enc(x,y),y) = x.
equation enc(dec(x,y),y) = x.

(* **)


data zero/0.
data succ/1.

free c,f.
free newgroup, revoke.
free rkeyreq, wkeyreq.
free corrupt. 

(* rprivchannel(rdr) and wprivchannel(wtr) *)

private fun rprivchannel/1.
private fun wprivchannel/1.
private fun p/0.

(* rdr(grp) and wtr(grp) *)

data rdr/1.
data wtr/1.

param predicatesImplementable = nocheck.

pred notbefore/2.
clauses
        notbefore:x,x;
	notbefore:x,y -> notbefore:succ(x),y.

nounif notbefore:*x,*y.

query let mx = m; 
      attacker:mx ==> 
		  ev:puts(wx,mx,vy)
		& ev:corrupt(rx,vx)
      	      	& ev:isreader(rx,vx)  
		& notbefore:vx,vy
		& ev:iswriter(wx,vy).

(*
query ev:gets(rx, mx, vx) ==> 
		  ev:writem(wx, mx, vx).

query ev:isreader(gx,rx,vx) ==>
	          ev:isgroup(gx).

query ev:iswriter(gx,wx) ==>
	          ev:isgroup(gx).

*)


let processOwr =
    in(c, =newgroup); 
    new sg;
    let lkey0 = N(sg) in
    let g = lkey0 in
    event isgroup(g);
    out(c,g);
    let privkey = signKey(d(sg,lkey0),N(sg)) in
    new currentversion;
    (
     (
      out(currentversion, (zero,sign(g,privkey)))
     )
    |
     (
     ! in(currentversion, (v,lkey));
       in(c, =(revoke, g));
       out(currentversion, (succ(v),sign(lkey,privkey))) 
       )
(*    |
     (
     ! in(currentversion, (=succ(zero),lkey));
       in(c, =(revoke, g));
       out(currentversion, (succ(succ(zero)),sign(lkey,privkey))) 
       )
*)    |
     (
     ! in(c, =(rkeyreq, rdr(g)));
       in(currentversion, (v,lkey));
       out(currentversion, (v,lkey));
       let r = rdr(g) in
       event isreader(r,v); 
       out(rprivchannel(r), (lkey, v))
       )
    |
     (
     ! in(c, =(wkeyreq, wtr(g)));
       in(currentversion, (v,lkey));
       out(currentversion, (v,lkey));
       let w = wtr(g) in
       event iswriter(w,v);
       let wkey = signKey(d(k,lkey),N(key(v))) in
       out(wprivchannel(w), (lkey, wkey, v))
       )
     ).

let processGoodRdr = 
    in(c,r);
    out(c, (rkeyreq,r));
    in(rprivchannel(r), (lkey,v));
    in(f,crypt);
    let n = modulus(v) in
    let pubkey = pubKey(lkey,n) in
    let rkey = verifyKey(pubkey,n) in
    let encx = verify(crypt,rkey) in
    let x = dec(encx,lkey) in
    event gets(r, x, v).

let processBadRdr =
    in(c,r);
    out(c, (rkeyreq,r));
    in(rprivchannel(r), (lkey,v));
    in(corrupt, =r);
    event corrupt(r,v);
    !out(c,(lkey,v)).

let processWtr =
    in(c,w); 
    out(c, (wkeyreq,w));
    in(wprivchannel(w), (lkey,wkey,v));
    new m; 
    event puts(w, m, v);
    !out(f,sign(enc(m,lkey),wkey)).

(*
let processFreeRdr1 = 
    in(p,(lkey,v));
    in(f,crypt);
    let encx = extract(crypt) in
    let x = dec(encx,lkey) in
    out(c,x).

let processFreeRdr2 = 
    in(p,(lkey,succ(v)));
    let x = extract(lkey) in
    out(p,(x,v)).
*)

process
        ((!processOwr) | (! processGoodRdr) | (!processBadRdr)  | (! processWtr)) 

