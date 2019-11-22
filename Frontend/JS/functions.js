//anonymous function with expession
var x =function(){
    console.log('Hello from anonymous function');
}

//calling function
x();

//naming function
function add(a,b){
    console.log(a+b);
}

//calling a naming funtion
add(12,13);

//immediately invoke function expression
(function() {
    console.log('IIfe is being executed');
})();

//immediately invoke function expression
(function(x,y) {
    console.log('The value is',x*y);
})(2,3);

//understanding return keyword
function division(a,b){
    return a/b;
}
console.log(division(2,1)); 