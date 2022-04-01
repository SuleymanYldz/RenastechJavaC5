package day_11_StringMethods;

public class c2_StringMethods {

    //    //toLowerCase()	      Converts a string to lower case letters	                        SessionString
    //    //toUpperCase()	      Converts a string to upper case letters	                        SessionString
    //    //trim()	              Removes whitespace from both ends of a string	                    SessionString



    public static void main(String[] args) {

        String fullName="Hello world";
        System.out.println(fullName.toUpperCase());


        System.out.println(fullName.toLowerCase());//hello world

        //print initials as a capital remain as a lowercase
        String str="hEllO woRlD";
        //          Hello World

        String firstName=str.substring(0,1).toUpperCase().concat(str.substring(1,4+1).toLowerCase()) ; //Hello
        String lastName=str.substring(6,7).toUpperCase().concat(str.substring(7).toLowerCase());//World

        String newFullName=firstName.concat(" ").concat(lastName);
        System.out.println("newFullName = " + newFullName);

        //    //trim()	              Removes whitespace from both ends of a string	                    SessionString

        String str2="   Hello  java   is  here   ";

        System.out.println(str2.trim()); //removes extra spaces from begining and ending
        //not from middle

        //if you remove all spaces from sentence
        System.out.println(str2.replace(" ", ""));
    }
}
