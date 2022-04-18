package StudySession;

public class FindUnique {

    public static void main(String[] args) {


        String unique="AAABBBCCCDEF";

        String result="";

        for (int i = 0; i < unique.length() ; i++) {

            int count=0;

            for (int j = 0; j <unique.length() ; j++) {

                if (unique.charAt(i)==unique.charAt(j)){
                    count++;
                }

            }
            if (count==1){
                result+=unique.charAt(i);
            }

        }
        System.out.println(result);
    }
}
