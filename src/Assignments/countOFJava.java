package Assignments;

public class countOFJava {

    public static void main(String[] args) {
     //   Create a java program that will print how many times java is written in the given
        //   String array=.  String [] name={"java","name1","name2","JaVa","JaVA","C","R" ,"Java"}

        String [] names={"java","name1","name2","JaVa","JaVA","C","R" ,"Java"};

        int count=0;

        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i]);

            if (names[i].equalsIgnoreCase("java")){
                count++;
            }


        }
        System.out.println("count of java : " + count);
    }
}
