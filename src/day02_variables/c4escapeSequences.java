package day02_variables;

public class c4escapeSequences {


    //    escape sequences:
//   \t: paragraph space
//  \n: new line
//  \": prints double quote " on the console
//  \\: prints \ on the console
//  \': prints single quote
//   ' : prints single quote

    public static void main(String[] args) {

        System.out.println("RenasTech");

        // \t: paragraph space

        System.out.println("\tRenasTech");
        System.out.println("\t\t\t\tRenastech");

        //n: mew line

        System.out.println("hello world");
        System.out.println("Hello\nWorld");
        System.out.println("Hello\n\tWorld\tjava");

        //  \": prints double quote " on the console
        //  \\: prints \ on the console
        System.out.println("\\\\");
        System.out.println("//");


        //  \": prints double quote " on the console
        System.out.println("Today is \"Tuesday\".");

        //  \': prints single quote
        //   ' : prints single quote
        System.out.println("Today is \'Friday\'.");
        System.out.println("Today is 'Friday'.");

    }








}
