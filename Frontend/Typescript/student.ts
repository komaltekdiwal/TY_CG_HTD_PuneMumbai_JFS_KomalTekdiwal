class Student{
    constructor(
        public name:string,
        public age:number,
        public marks:number,
        public degree ?:string,
        public id ?: string){

        }

        // printDetails(){
        //     console.log(`Name is ${this.name} age is ${this.age} and marks are ${this.marks}`);

        // }
    }

    let student1= new Student('komal',22,99,'BE');

    console.log(student1);
   // student1.printDetails();

    let student2: Student = {
        name:'Mayur',
        age:23,
        marks:89,
        degree:'BE',
        id:'1234'
    }

    console.log(student2);


    //Array with student object

    let students: Student[] = [
        new Student('Dholu',24,87),
        {
            name:'Mayur',
            age:23,
            marks:89,
            degree:'BE',
            id:'1234'
        },
        student2,
        student1,
    ];
    

    for(let student of students){
        console.log(student);
    }


    class Graduate extends Student{
       constructor(
           name: string,
           age: number,
           marks: number,
           degree ?: string
       ){
             super(name, age, marks);
       }
    }