//fat arrow function
let add = (a,b) =>{
    console.log("The sum is :" ,a+b);
}

add(12,13);

//fat arrow function with one argument
let printAge = age =>{
    console.log("The age is",age);
}

printAge(123456);

//fat arrow function with only return statement
let product=(a,b)=>a*b;
console.log(product(12,12));