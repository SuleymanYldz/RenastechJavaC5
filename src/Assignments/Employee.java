package Assignments;

public class Employee extends Person {

 //   create a class called Employee
//        attributes: name, age, gender, Salary, employeeID, jobTitle
//        methods: work, setEmployeeInfo, toString

    double Salary;
    long employeeID;
    String jobTitle;

    public void work(){
        System.out.println(name + " is working ");
    }
    public void setEmployeeInfo(String name, int age, char gender, double Salary, long employeeID, String jobTitle){
      this.employeeID=employeeID;
      this.name=name;
      this.age=age;
      this.gender=gender;
      this.Salary=Salary;
      this.jobTitle=jobTitle;

    }
    public String toString(){
        return "Name is " + name+ " age " + age+ " " + "gender: "+ gender+" "+"Salary :"+ Salary+" "+"employeeID: "+" "+ employeeID+" " + "Title "+" "+ jobTitle;
    }
}
