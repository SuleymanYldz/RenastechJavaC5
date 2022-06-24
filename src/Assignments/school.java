package Assignments;

import java.util.ArrayList;

public class school extends Student {

 //   create a class called school:
//          create 3 objects of student and set their info
//          create a an ArrayList of students to store all student objects
//          use for each loop to print out each students' name and studentID

    String name;
    long studentID;
    int grade;
    public school(String name, long studentID, int grade){
        this.studentID=studentID;
        this.name=name;
        this.grade=grade;
    }
    public String toString(){

        return "Name : "+ name+ "ID : "+ studentID+ " Grade : "+ grade;
    }

    public static void main(String[] args) {

        Student student1=new Student();
        student1.setStudentInfo("Suleyman",24,'M',123456789);
        System.out.println("student1.name = " + student1.name);
        System.out.println("student1.studentID = " + student1.studentID);

        System.out.println("--------------------------------------");

        Student student2=new Student();
        student2.setStudentInfo("Judy",10,'F',987654321);
        System.out.println("student2.gender = " + student2.gender);
        System.out.println("student2.studentID = " + student2.studentID);
        System.out.println(student2);

        System.out.println("******************************************");

        Student student3=new Student();
        student3.setStudentInfo("Margaret",3,'F',8520258);
        System.out.println("student3.name = " + student3.name);
        System.out.println(student3);


        school [] students=new school[3];
        students [0]=new school("Suleyman",258475,6);
        students [1]=new school("Judy",7489754,4);
        students [2]=new school("margaret", 36987465,2);

        for (int i=0; i <3; i++){
            System.out.println("students[i] = " + students[i]);
        }



    }

}
