package PracticeGeneral;

import java.util.Arrays;

public class method_Overloading {

    public static void main(String[] args) {

        int [] numbers={10,20,30,40,50,};
        String [] names={"Suleyman", "Nisa","tuba", "tulay"};
        char [] letters={'A','B','C','C','D','F'};

        Arrays.sort(numbers);
        Arrays.sort(names);
        Arrays.sort(letters);

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(letters));
    }
}
