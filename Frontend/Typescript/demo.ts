//..........................string datatype

let myName:string='komal';
// myName=1233; error-we cant change datatype

//.............................any datatype

let company;//implicitly it will be considered as any
company=123;
company='komal';
company=true;

//..........................union datatype

let age : string | number; 
age=12;
age='twenty-two'
// age=true;error-only string and number can be store


//........................tuple

let details:[string,number,number]=['xyz',12345,1234];

//........................array
let mobiles:string[]=['komal','sonu','1212','true','false'];

let mobiles1: string[]|number=['komal','1212','true','false'];

//......................function
function add(a: number , b:number):number{
    return a+b;
}
