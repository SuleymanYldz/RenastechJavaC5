package StudySession;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

/*
// Guessing game
//Please follow the steps below

// Step 1-  Create 2 int variables with name of randomNumber , userInput;

//Step 2- Create a program that will generate randomly a number between 1 to 10

to generate a random number use >>

 Random random=new Random();
 int randomNumber = random.nextInt(10) + 1;


// Step 2- Ask the user to enter a number between 1-10

//Step 3-  Create a logic with a do-while loop that will ask the user to enter a number as long as the random number and user input are not matching.
 */

    public static void main(String[] args) {

        int number, userInput;

        do {
            Random random=new Random();

            number=random.nextInt(10) + 1;

            Scanner input=new Scanner(System.in);
            System.out.println("Enter a number between  1 - 10 ");

            userInput=input.nextInt();
            System.out.println("Random is  :"+ number);

        }while (number != userInput);

        System.out.println("Congrats.....");
    }

}
