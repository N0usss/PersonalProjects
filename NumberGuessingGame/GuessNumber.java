package NumberGuessingGame;

import java.util.Scanner;

public class GuessNumber {

    public static void guessGame(){

        Scanner in = new Scanner(System.in);

        //Using math.random method for the code to choose random number between 1-100
        int number = 1 + (int)(100*Math.random());

        //Number of trials given for the user to guess
        int trial = 5;

        int i, guess;

        System.out.println("A number has been chosen" + " between 1 to 100. ");
        System.out.println("Guess the number" + " within 5 trials.");

        //The guessing game code begins here by looping
        for(i=0;i<trial;i++){

            System.out.println("Guess the number:");

            guess = in.nextInt();

            //If the user guess the correct number, the system will stop immediately.
            if(number == guess){

                System.out.println("Congrats! You Win");
                break;
            }

            else if(number > guess && i != trial - 1){

                System.out.println("The number is greater than " + guess);
            }

            else if(number < guess && i != trial - 1){

                System.out.println("The number is less than " + guess);
            }
        }

        //When user out of trials for guesses, the system will stop
        if ( i == trial){

            System.out.println("You're out of trials");

            System.out.println("The number was " + number);
        }
    }

    public static void main(String arg[]) {
        
        guessGame();
    }
    
}
