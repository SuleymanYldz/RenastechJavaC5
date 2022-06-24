package PracticeGeneral;

public class Students {


    String name;
    int id;
    String schoolName;

     static int countNumbers=0;

    public Students(int id, String name){
        this.name=name;
        id=setStudentsNumber();

    }
    public static int setStudentsNumber(){

        countNumbers++;
        return countNumbers;

    }
    public void  getInfo(){

        System.out.println("name = " + name);
        System.out.println("id = " + id);
        System.out.println("schoolName = " + schoolName);
    }

}
