package PracticeGeneral;

import java.util.Arrays;
import java.util.Scanner;

public class FirstANDLastLetter {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String [] nameList=new String[5];


        for (int i = 0; i <nameList.length ; i++) {
            System.out.println("enter a name for index"+ i);
            nameList[i]= scan.next();
        }
        System.out.println(Arrays.toString(nameList));
        String firstLAstletter= "";

        for (String eachName:nameList){
            firstLAstletter+=""+ eachName.charAt(0)+ eachName.charAt(eachName.length()-1);
        }
        System.out.println(firstLAstletter);
    }
}
