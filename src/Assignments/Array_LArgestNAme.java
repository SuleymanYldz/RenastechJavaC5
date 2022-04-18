package Assignments;


public class Array_LArgestNAme {

    //write a program that can return the largest string of text from an array
//ex     String[] names = {"hello", "world", "java", "pyton", "sevgin", "renastechschool"};
//output :renastechschool
//write a program that can return the shortest string of text from an array
////ex     String[] names = {"hello", "world", "java", "pyton", "JS" "sevgin", "renastechschool"};

    public static void main(String[] args) {

        String[] names= {"hello", "world", "java", "pyton", "sevgin", "renastechschool"};

        System.out.println(names[0].length());

        int longestName=0;

        for (int i = 0; i <names.length ; i++) {

            if (names[i].length() > longestName){
                longestName=i;

            }

        }

        System.out.println(names[longestName]);
        System.out.println("***************************");

        String[] names2 = {"hello", "world", "java", "pyton", "JS", "sevgin", "renastechschool"};

        String smallest= names2[0];

        int shortestName=0;

        for (int j = 1; j < names2.length ; j++) {
            if (names2[j].length() < smallest.length()){
               smallest=names2[j];
            }

        }
        System.out.println(smallest);
    }
}
