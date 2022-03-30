package Assignments;

public class JohnAndMikeTeam {

    public static void main(String[] args) {

        int JohnTeam=(89+103+120)/3;
        int MikeTeam=(116+94+123)/3;

        System.out.println("john average score is " + JohnTeam);
        System.out.println("Mikes average score is " + MikeTeam);
        if (MikeTeam > JohnTeam){
            System.out.println("MikesTeam is winner " + MikeTeam);
        }else if (JohnTeam>MikeTeam){
            System.out.println("JohnTeam is winner " + JohnTeam);
        }
        else {
            System.out.println("They are Equal");
        }
    }
}
