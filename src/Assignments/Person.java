package Assignments;

public class Person  {

    //    create a class called Person
//        attributes: name, age, gender
//        methods: eat, walk, sleep, setPersonInfo
//
//    create a class called Employee
//        attributes: name, age, gender, Salary, employeeID, jobTitle
//        methods: work, setEmployeeInfo, toString
//
//    create a class called Student
//        attributes: name, age, gender, studentID, classes
//        methods: attendClass, code, setStudentInfo, toString
//
//    create a class called school:
//          create 3 objects of student and set their info
//          create a an ArrayList of students to store all student objects
//          use for each loop to print out each students' name and studentID
//
//    create a class called company:
//          create 3 objects of employee and set their info
//          create an array of employees and store all those employee objects
//          use regular for loop to print out each employee' name and employeeID

    String name;
    int age;
    char gender;

    public void eat(){
        System.out.println(name+ " is eaing Pizza");
    }
    public void walk(){
        System.out.println(name + " is walking");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public void setPersonInfo(String name , int age,  char gender){
        this.age=age;
        this.name=name;
        this.gender=gender;

        System.out.println(name +" /"+ age+ " /" +gender + " /");

    }
}
