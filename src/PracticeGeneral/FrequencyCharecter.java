package PracticeGeneral;

public class FrequencyCharecter {


    public static void main(String[] args) {



        String str = "AAAABBCCDD"; // A4B2C2D2
        String result1 = "";
        String result = "";

        for(int i=0; i < str.length(); i++)
            if(!result.contains(""+str.charAt(i)))
                result+= ""+str.charAt(i);

        for( int j=0;j < result.length(); j++) {
            int count = 0;
            for(int i=0; i < str.length(); i++) {
                if(str.charAt(i) == result.charAt(j))
                    count++;
            }
            result1 +=result.charAt(j)+"" + count;
        }
        System.out.println(result1); // A4B2C2D2

    }

}



