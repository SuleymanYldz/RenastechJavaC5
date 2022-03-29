package Assignments;

public class Newroz {

           /*
Create a string variable with today’s data Example: “March 2”;
Create another variable with newrozDate and put the value of the Newroz date
if today’sDate and newrozDate are equal print Happy Newroz.

            */
           public static void main(String[] args) {

               String TodaysDate="March 2";
               String NewrozDate= "March 2";
               String HappyNewroz= TodaysDate + NewrozDate;
               if (TodaysDate==NewrozDate){
                   System.out.println("Newroz Piroz Be");


                   System.out.println("****************");

                   int johnsTeam= (89 + 120 + 103 / 3);
                   int MikesTeam=(116+94+123 / 3);


                   System.out.println("Average score of John's Team is "+ johnsTeam);
                   System.out.println("Average score of Mike's Team is "+ MikesTeam);

                   if (johnsTeam > MikesTeam ){
                       System.out.println("Winner is Johns Team ");

                   }else {
                       System.out.println("Winner is Mike Team");


                   }
               }
           }




}
