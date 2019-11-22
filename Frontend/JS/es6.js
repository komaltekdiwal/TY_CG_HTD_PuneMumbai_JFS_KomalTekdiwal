let person={
    name:'komal',
    age:22
};

let student={
    ...person,
    UID:1234,
    percentage:99.99
};

console.log(student);

let mname=['komal','mayur'];
let mname1=['sonu','dholu'];
let mname2=['tillu','mithhu'];

let MNAME=[
    ...mname,
    ...mname1,
    ...mname2,
    'nisha'
]

console.log(MNAME);

let[name1,name2,name3,...restValues] = MNAME;
console.log(name1);
console.log(name2);
console.log(name3);
console.log(restValues);




































