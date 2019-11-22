//..........................string datatype
var myName = 'komal';
// myName=1233; error-we cant change datatype
//.............................any datatype
var company; //implicitly it will be considered as any
company = 123;
company = 'komal';
company = true;
//..........................union datatype
var age;
age = 12;
age = 'twenty-two';
// age=true;error-only string and number can be store
//........................tuple
var details = ['xyz', 12345, 1234];
//........................array
var mobiles = ['komal', 'sonu', '1212', 'true', 'false'];
var mobiles1 = ['komal', '1212', 'true', 'false'];
//......................function
function add(a, b) {
    return a + b;
}
