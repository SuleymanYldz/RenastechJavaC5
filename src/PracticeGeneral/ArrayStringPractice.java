package PracticeGeneral;

import java.util.Arrays;

public class ArrayStringPractice {

    public static void main(String[] args) {

        String [] names={"tuba", "nisa","tulay","muhammet","suleyman","gulistan"};

        System.out.println(names);
        System.out.println(Arrays.toString(names));
        System.out.println(names[3]);


        System.out.println("-------------------------");
        int [] a={1,2,3,4,5,6};
        int [] b={10,20,30,540};

        int [] c = new int[a.length + b.length];
        System.out.println(Arrays.toString(c));

        for (int i = 0; i <a.length ; i++) {
            c[i]=a[i];

        }
        System.out.println(Arrays.toString(c));

        for (int i = 0; i <b.length ; i++) {
            c[a.length+ i]=b[i];


        }
        System.out.println(Arrays.toString(c));

    }
}
