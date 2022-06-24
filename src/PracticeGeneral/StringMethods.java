package PracticeGeneral;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String name="Suleyman yildiz";

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.lastIndexOf(name));
        System.out.println(name.charAt(7));
        System.out.println(name.substring(9,15));
        System.out.println("name.getBytes().length = " + name.getBytes().length);
    }
}
