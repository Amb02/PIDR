(* This program generates ProVerif scripts for the plutus
   filesystem (work by Avik Chaudhuri) 
   Compile with: ocamlopt -o plutusgen.exe plutusgen.ml
   Usage: plutusgen.exe [n] > plutus_[n]versions
          ../../proverif.exe -in pi plutus_[n]versions
   generates and analyzes a script with [n] readers,
   each of them revoked in turn.
*)


let rec succ n s =
  if n = 0 then print_string s else
  begin
    print_string "succ(";
    succ (n-1) s;
    print_string ")"
  end

let notbefore n m =
  print_string "notbefore:";
  succ n "zero";
  print_string ",";
  succ m "zero"

let rec notbeforen n =
  if n = 0 then
    begin
      notbefore 0 0;
      print_string ".\n"
    end
  else 
    begin
      for i = 0 to n do 
        notbefore n i;
        print_string ";\n"
      done;
      notbeforen (n-1)
    end

let plutus n =
  print_string "(* Generated script of the protocol plutus with ";
  print_int n;
  print_string " versions *)

(*...
param traceDisplay = long.
*)

(* _kgen(group,version,secret key) *)

fun skgen/3.
fun pkgen/3.

data zero/0.
data succ/1.

(* last version *)

reduc max() = ";
  succ n "zero";
  print_string ".

(* w is group, x is version, y is secret key *)

reduc unwind(skgen(w,succ(x),y)) = skgen(w,x,y).

(* write(filename,term,writerkey) *)

fun write/3.

(* read(filename,crypt,readerkey) *)

reduc read(z,write(z,u,pkgen(w,x,y)),skgen(w,x,y)) = u.

free c,f.
free newgroup, revoke.
free rkeyreq, wkeyreq.
free corrupt. 

(* grp(secret key) *)

fun grp/1.

(* rprivchannel(rdr) and wprivchannel(wtr) *)

private fun rprivchannel/1.
private fun wprivchannel/1.

(* rdr(grp(secret key),version) *)

data rdr/2.
data wtr/1.

(*...

data nil/0.
data cons/2.

pred member/2.
clauses
	member:x,cons(x,y);
	member:x,y -> member:x,cons(z,y).
*)

pred notbefore/2.
clauses
";
  notbeforen n;
  print_string "

(* -------- Proved to be true *)
query let mx = m; 
      attacker:mx ==> 
      	      	  ev:isreader(gx, rx, vx) 
		& ev:corrupt(rx,vx) 
		& ev:writem(wx, mx, vy)
		& notbefore:vx,vy
		& ev:iswriter(gx, wx).

(* -------- Proved to be true *)
query ev:gets(rx, mx, vx) ==> 
      		  ev:isreader(gx, rx, vx) 
		& ev:writem(wx, mx, vx) 
		& ev:iswriter(gx, wx) 
		& ev:isgroup(gx).


(* group is grp(secret key) *)

(* reader is rdr(group,version) *)

(* writer is wtr(group) *)

let processOwr =
    in(c, =newgroup); 
    new sk;
    let g = grp(sk) in
    event isgroup(g);
    out(c,g);
    new currentversion;
    (out(currentversion, zero) |
     (
     ! in(currentversion, v);
       in(c, =(revoke, g));
       if notbefore:v,max then 0 else out(currentversion, succ(v)) 
       )
    |
     (
     !in(c, (=rkeyreq, rdr(=g,vx)));
     in(currentversion, v);
     out(currentversion, v);
     if notbefore:vx,v then
     let r = rdr(g,vx) in
     event isreader(g, r, v); 
     out(rprivchannel(r), (skgen(g, v, sk), v))
     )
    |
     (
     !in(c, =(wkeyreq, wtr(g)));
     in(currentversion, v);
     out(currentversion, v);
     let w = wtr(g) in
     event iswriter(g, w);
     out(wprivchannel(w), (pkgen(g, v, sk), v))
     )
     ).

let processGoodRdr = 
    in(c,r);
    out(c, (rkeyreq, r));
    in(rprivchannel(r), (rkey, v));
    in(f,crypt);
    let n = read(f,crypt,rkey) in
    event gets(r, n, v).

let processBadRdr =
    in(c,r);
    out(c, (rkeyreq, r));
    in(rprivchannel(r), (rkey, v));
    in(corrupt, =r);
    event corrupt(r,v);
    out(c, rkey).

let processWtr =
    in(c, w); 
    out(c, (wkeyreq, w));
    in(wprivchannel(w), (wkey,v));
    new m; 
    event writem(w, m, v);
    !out(f,write(f,m,wkey)).
 

process
	((!processOwr) | (! processGoodRdr) | (!processBadRdr)  | (! processWtr)) 
	
"


let _ =
  try 
    plutus (int_of_string (Sys.argv.(1)))
  with _ ->
    print_string "Error. Usage: plutusgen n\nwhere n is an integer\n"
