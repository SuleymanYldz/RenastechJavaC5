package PracticeGeneral;

import java.util.LinkedHashMap;

public class Map2Practice {

    public static void main(String[] args) {

        LinkedHashMap<String,Integer>studentScore=new LinkedHashMap<>();
        studentScore.put("Sy",85);
        studentScore.put("Nisa",90);
        studentScore.put("Tuba",55);
        studentScore.put("Gulistan",75);


        LinkedHashMap<String,Integer> scoresA=new LinkedHashMap<>();
        LinkedHashMap<String,Integer>scoresC=new LinkedHashMap<>();

        System.out.println(scoresA);
        System.out.println(scoresC);

        for (String eachStudent: studentScore.keySet()){
            int eachStudentScore=studentScore.get(eachStudent);
            if (eachStudentScore>=85){
                scoresA.put(eachStudent,eachStudentScore);
            }else if (eachStudentScore>=40&&eachStudentScore<70){
               scoresC.put(eachStudent,eachStudentScore);
            }
        }
        System.out.println(scoresA);
        System.out.println(scoresC);
    }
}
