package CollectionMap;

import java.util.HashMap;

public class Map {

    public static void main(String[] args) {

        HashMap<String,Integer>employeeID=new HashMap<>();

        employeeID.put("Suleyman",123466);
        employeeID.put("Nisa",1020304050);
        employeeID.put("Tulay",25807410);
        System.out.println(employeeID);

        System.out.println(employeeID.get("Suleyman"));

        System.out.println(employeeID.containsKey("Gule"));

        System.out.println(employeeID.containsValue(96));

        System.out.println(employeeID.containsValue(25807410));

        employeeID.replace("Nisa",00000);
        System.out.println(employeeID);
    }
}
