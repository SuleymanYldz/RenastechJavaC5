package Assignments;

public class Student  extends Person{

  //  create a class called Student
//        attributes: name, age, gender, studentID, classes
//        methods: attendClass, code, setStudentInfo, toString

    long studentID;
    int clas;

    public void attendClass(){
        System.out.println(name + " is attended class");
    }
    public void code(){

    }
    public void setStudentInfo(String name, int age, char gender,long studentID){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.studentID=studentID;

    }
    public String toString(){
        return "Student name is "+ name+" "+ age+" years old"+" "+"Gender:"+ gender+ " "+ "StudentID :"+" "+ studentID+ "class: " +clas;
    }
}
