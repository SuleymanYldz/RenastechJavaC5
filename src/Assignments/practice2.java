package Assignments;

public class practice2 {

    public static void main(String[] args) {

        int i1=40/3;
        int i2=39/3;

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        System.out.println("*******************************");

        int JohnTeam=(89+120+103)/3;
        int mikeTeam=(116+94+123)/3;

        if (JohnTeam > mikeTeam){
            System.out.println("Winner team is" + JohnTeam);
        }else if (mikeTeam > JohnTeam){
            System.out.println("Winner is MikeTeam  " + mikeTeam);

        }else {
            System.out.println("Both team  have same scores");
        }

    }
}
