// var x=[1234,'Komal',true,{name:'mayur'}];
// console.log(x[1]);

// for(var i =0;i<x.length;i++){
//     console.log(x[i]);
// }

var colors=['pink','blue','black','white']; 
console.log(colors);

colors.pop();
console.log(colors);
colors.push('violet','green');
console.log(colors);
colors.shift();
console.log(colors);
colors.unshift('purple','black');
console.log(colors);
colors.splice(2,2);
colors.splice(3,0,'indigo','orange','foreign black');
console.log(colors);
colors.splice(2,1,'indigo','orange','foreign black');
console.log(colors);

//callback concept
function test(callback){
    console.log('test function started');
    callback();
    console.log('test function ended');
}

// test(function(){

// console.log('callback function is being execited');
// });

// colors.forEach(function(value){
//     console.log(value);
// });

// colors.forEach(function(value,index,array){
//     console.log(value,index,array);
// });

console.log(colors.indexOf('black'));

var myArray=[1,2,3,4,5,6,2,2,2,7,8,9];
var x=myArray.filter(function(value){
    return value>3;
});

console.log(x);

//filtered method for unique values
var filteredArray=myArray.filter(function(value,index,array){
    return array.indexOf(value)===index;
});

console.log(filteredArray);

// if(123=='123'){
//     console.log('true');
// }
//     else{
//         console.log('false');
//     }

//     if(123==='123'){
//         console.log('true');
//     }
//         else{
//             console.log('false');
//         }
    
// for(var x of myArray){
//     console.log(x);
// }

// for(var index in colors){
//     console.log("the value is "+colors[index]+"  index is "+index);
// }

var movie={
    name:'yeh jawani hai deewani',
    actor:'Ranbir',
    actress:'deepika',
    director:'Ayan Mukherji'
}

console.log(movie['name']);
for(var key in movie){
    console.log(key +":" + movie[key]);
}








































// setTimeout(function(){
//     console.log('2 seconds done');
// },2000);

 //var i = 1;
 // setInterval(function(){
// console.log(i);
// i++;
//},1);

// setInterval(function(){
//     console.log('2 seconds done');
// },2000);
