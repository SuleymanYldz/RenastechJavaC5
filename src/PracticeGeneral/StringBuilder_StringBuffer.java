package PracticeGeneral;

public class StringBuilder_StringBuffer {
    //String vs StringBuilder vs StringBuffer:
    //
    //		String: Immutable version char sequences
    //
    //		StringBuilder: mutable version char sequences, not synchronized
    //
    //		StringBuffer: mutable version char sequences, synchronized , thread-safe, slow
    public static void main(String[] args) {

        String str="hello";
        str.concat("world");
        System.out.println("str = " + str);

        String str2=str.concat("world");
        System.out.println("str2 = " + str2);

        StringBuilder builder=new StringBuilder("Suleyman");
        builder.append("hello");
        builder.append("world");

        System.out.println("builder = " + builder);

        StringBuffer buffer=new StringBuffer("Suleyman");
        buffer.append("yildiz ");
        System.out.println("buffer = " + buffer);

        String word="Suleyman";
        StringBuilder builder1=new StringBuilder(word);
        System.out.println(builder1.reverse());


        String word2="Yildiz";

        StringBuilder reverseWord=new StringBuilder(word2);
        System.out.println(reverseWord.reverse());

        String word3="Gaziantep";
        StringBuffer city=new StringBuffer(word3);

        System.out.println(city.reverse());
    }
}
