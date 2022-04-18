package PracticeGeneral;

public class PracticesesMethods {

    public static void main(String[] args) {

        String word="Suleyman yildiz";

        System.out.println(word.replace("u", "$"));
        System.out.println(word.replace("yildiz", "money"));



        String name="Java is fun, I like Java , java is smart";

        boolean b1= name.startsWith("java") && name.endsWith("Java");
        boolean b2= name.startsWith("Java") && name.endsWith("smart");

        System.out.println(b1);
        System.out.println(b2);


    }
}
