package Objects;

public class SDET {


   // create a class called SDET   Attributes:
    //name, employeeID, Salary , companyName Actions:
    //setInfo(), testing()--> name is testing , creatingTicket(boolean isBug);


    String name;
    int employeeid;
    int salary;
    String companyName;


    public void setSdetInfo(String Sdetname, int Sdetemployeeid, int Sdetsalary, String SdetcompanyName){

        name=Sdetname;
       employeeid=Sdetemployeeid;
       salary=Sdetsalary;
       companyName=SdetcompanyName;



    }
    public void testing(){

        System.out.println(name +  "is testing " + companyName);
    }
    public void creatingTicket(Boolean isBug){

        if (isBug){
            System.out.println(name + " has a bug ");
        }else {
            System.out.println("no bug no issue");
        }


    }

    public static void main(String[] args) {

        SDET sdet=new SDET();

        sdet.name="Suleyman";
        sdet.employeeid=2580;
        sdet.salary=144000;
        sdet.companyName="Amazon";

        System.out.println(sdet.name +","+ sdet.employeeid + ","+ sdet.companyName +","+ sdet.salary);




    }


}
