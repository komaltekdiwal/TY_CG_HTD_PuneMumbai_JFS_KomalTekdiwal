//literal way of object creation
var student ={
    name:'komal',
    age:22,
    degree:'BE',
    phoneNumber:9765914865
};

console.log(student.name);
console.log(student);

student.phoneNumber=9067413307;
console.log(student.phoneNumber);

 //adding element to object
student.selectedCompany='Capgemini';   
console.log(student);           

//using object constructor
var laptop = new Object();
laptop.brand='HP';
laptop.ram='8GB';
laptop.processor='core i3';
laptop.price=28000;

console.log(laptop);

console.log(Object.keys(laptop));  //return all keys present in object
console.log(Object.keys(laptop).length);
