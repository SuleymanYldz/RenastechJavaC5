package PracticeGeneral;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Map3Practice {

    public static void main(String[] args) {


        LinkedHashMap<String,String>gmailCredential=new LinkedHashMap<>();
        gmailCredential.put("user1","123");
        gmailCredential.put("user2","slymn12345");
        gmailCredential.put("user3","tukey15");

        System.out.println("gmailCredential = " + gmailCredential);
        for (String eachKey:gmailCredential.keySet()){
            System.out.println(eachKey);
        }
        for (String eachValue:gmailCredential.values()){
            System.out.println(eachValue);
        }

        ArrayList<String>userNames=new ArrayList<>(gmailCredential.keySet());
        ArrayList<String>password=new ArrayList<>(gmailCredential.values());

        System.out.println(userNames);
        System.out.println(password);
    }
}
