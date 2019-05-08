free c.
(* 

Echo protocol extended with a signature.

Message 1: A -> B : NA
Message 2: B -> A : NA
Message 3: A -> B : Sig(B,[NA,A,B]).

The heart of the protocol is messages 3, 6, 7.

*)

(* Public key cryptography *)

fun pk/1.
fun encrypt/2.
reduc decrypt(encrypt(x,pk(y)),y) = x.

(* Host names
   The server has a table (host name, public key), which we
   represent by the function getkey. *)

fun host/1.
private reduc getkey(host(x)) = x.

(* Signatures *)

fun sign/2.
reduc checksign(sign(x,y),pk(y)) = x.
reduc getmess(sign(x,y)) = x.

(* Shared-key cryptography *)

fun sencrypt/2.
reduc sdecrypt(sencrypt(x,y),y) = x.

(* Secrecy assumptions *)

not skA.
not skB.



private free secretANa, secretANb, secretBNa, secretBNb.


query evinj:vrecv(xNa) ==> (evinj:presp(xNa) ==>
               (evinj:precv(xNa) ==> evinj:vreq(xNa))).

let processA =  
	(* Message 1 *)
			new Na;
			event vreq(Na);
			out(c, Na);
	(* Message 2 *)
			in(c, ma);
			if Na = ma then
				event vrecv(ma).


let processB = 
	(* Message 1 *)
			in(c, mb);
			event precv(mb);
	(* Message 2 *)
                        event presp(mb);
			out(c, mb).
	
			
					
process 	new skA; 
		let pkA = pk(skA) in
        		out(c, pkA);
        	new skB; 
        	let pkB = pk(skB) in
        		out(c, pkB);
		let hostA = host(pkA) in
			out(c, hostA);
		let hostB = host(pkB) in
			out(c, hostB);
		((!processA) | (!processB))
