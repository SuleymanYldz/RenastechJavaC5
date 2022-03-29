package Assignments;

public class StringHi_Mom {

    public static void main(String[] args) {

        String hi= "Hi, ";
        String mom= "Mom. ";
        System.out.println(hi.concat(mom));
        System.out.println(hi.concat("").concat(mom));


        System.out.println("***************");

        String Hello="hello ";
        String guys= "Guys ";
        System.out.println(Hello + guys);
        System.out.println(Hello.concat("").concat(guys));
        System.out.println(Hello.concat(guys));
    }
}
