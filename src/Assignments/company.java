package Assignments;

public class company extends Employee {

  //  create a class called company:
//          create 3 objects of employee and set their info
//          create an array of employees and store all those employee objects
//          use regular for loop to print out each employee' name and employeeID


    public static void main(String[] args) {

        Employee employee1=new Employee();

        employee1.setEmployeeInfo("Suleyman",24,'M',144000,123456789,"SDET Engineer");
        System.out.println("employee1.age = " + employee1.age);
        System.out.println("employee1.jobTitle = " + employee1.jobTitle);
        System.out.println(employee1);

        System.out.println("*******************************");

        Employee employee2=new Employee();
        employee2.setEmployeeInfo("Judy",40,'F',110000,741258963,"P.Manager");
        System.out.println(employee2);
        System.out.println("employee2.Salary = " + employee2.Salary);

        System.out.println("********************************");

        Employee employee3=new Employee();
        employee3.setEmployeeInfo("Margaret",25,'F',950000,21346374,"Supervisior");
        System.out.println("employee3.jobTitle = " + employee3.jobTitle);
        System.out.println("employee3.Salary = " + employee3.Salary);
        System.out.println("employee3 = " + employee3);

        System.out.println("***********************************");


    }
}
