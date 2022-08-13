module A = Array
module C = Char
module I = Int64
module L = List
module Q = Queue
module S = String

let pf = Printf.printf
let sf = Scanf.scanf
let ssf = Scanf.sscanf

let read_int () = sf " %d" (fun x -> x)
let read_float () = sf " %f" (fun x -> x)
let read_array read n = A.init n (fun _ -> read ())
let err s = raise (Failure s)

let inf = int_of_float 1e18
let eps = 1e-11

let rec get_digits l = function 
  0 -> l 
| k -> get_digits ((k mod 10)::l) (k/10);;

let rec push_all queue tbl depth = function
  [] -> ()
| (e::l) -> (Hashtbl.add tbl e depth); (Q.push e queue); push_all queue tbl depth l;;

let rec solve queue tbl n = 
  if not (Q.is_empty queue) then
    let k = Q.take queue in
    let depth = Hashtbl.find tbl k in
    (*pf "%d,%d\n" k depth;*)
    let digits = get_digits [] k in
    (*pf "%d\n" (List.length digits);*)
    if List.length digits == n then depth 
    else
      let dig_filter a = 
        if (a <> 0 && a <> 1 && not (Hashtbl.mem tbl (a*k))) then (a*k)
        else -1
      in
      let values = List.map dig_filter digits in
      let vals = List.filter (function a -> a != -1) values in
      push_all queue tbl (depth+1) vals;
      solve queue tbl n
  else -1;;

let () = 
  (* let cases = read_int() in*)
  (* for case = 1 to cases do *)
    let n = read_int() in
    let x = read_int() in

    let tbl = Hashtbl.create 10000 in
    let queue = Q.create () in

    Q.push x queue;
    Hashtbl.add tbl x 0;
    pf "%d\n" (solve queue tbl n)
  (*done*)