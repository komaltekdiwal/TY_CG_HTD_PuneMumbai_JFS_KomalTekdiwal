var Student = /** @class */ (function () {
    function Student(name, age, marks, degree, id) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.degree = degree;
        this.id = id;
    }
    return Student;
}());
var student1 = new Student('komal', 22, 99, 'BE');
console.log(student1);
// student1.printDetails();
var student2 = {
    name: 'Mayur',
    age: 23,
    marks: 89,
    degree: 'BE',
    id: '1234'
};
console.log(student2);
//Array with student object
var students = [
    new Student('Dholu', 24, 87),
    {
        name: 'Mayur',
        age: 23,
        marks: 89,
        degree: 'BE',
        id: '1234'
    },
    student2,
    student1,
];
for (var _i = 0, students_1 = students; _i < students_1.length; _i++) {
    var student = students_1[_i];
    console.log(student);
}
