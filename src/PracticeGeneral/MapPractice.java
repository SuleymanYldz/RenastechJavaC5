package PracticeGeneral;

import java.util.LinkedHashMap;
import java.util.Map;
public class MapPractice {

    public static void main(String[] args) {

        Map<String,Integer>StudentInfo=new LinkedHashMap<>();

        StudentInfo.put("Suleyman",1380);
        StudentInfo.put("Nisa",2580);

        System.out.println("StudentInfo = " + StudentInfo);
        System.out.println("StudentInfo.size() = " + StudentInfo.size());
        System.out.println("StudentInfo.get(\"Suleyman\") = " + StudentInfo.get("Suleyman"));
        StudentInfo.remove("Nisa");
        System.out.println("StudentInfo = " + StudentInfo);
        StudentInfo.put("Gulistan",34);
        StudentInfo.put("Tulay",12);
        StudentInfo.put("Tuba",34);
        StudentInfo.put("Gulistan",63);

        System.out.println("StudentInfo = " + StudentInfo);

        LinkedHashMap<String,Double>studentsAge=new LinkedHashMap<>();

        studentsAge.put("Sy",24.02);
        studentsAge.put("Nisa",12.00);
        studentsAge.put("tuba",8.01);

        System.out.println("studentsAge = " + studentsAge);
        System.out.println("studentsAge.get(\"Nisa\") = " + studentsAge.get("Nisa"));

        boolean b1= studentsAge.containsKey("Sy");
        boolean b2=studentsAge.containsKey("Bi");
        boolean b3=studentsAge.containsValue(24.02);
        boolean b4=studentsAge.containsValue(12.01);
        System.out.println(b1+ " "+ b2);

        studentsAge.clear();
        System.out.println("studentsAge = " + studentsAge);
        System.out.println(studentsAge.isEmpty());

    }
}
