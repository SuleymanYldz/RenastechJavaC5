package Assignments;

public class IgnoreCaseConsideration {

   // Write a Java program to compare a given string to another string, ignoring case considerations.
    //Sample Output:
      //      "Stephen Edwin King" equals "Walter Winchell"? false
        //    "Stephen Edwin King" equals "stephen edwin king"? true

    public static void main(String[] args) {

        String a= "Stephen Edwin King";
        String b= "Walter Winchell";
        String c= "stephen edwin king";
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.equalsIgnoreCase(c));
    }
}
