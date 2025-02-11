package TextAdventureGame;

import java.util.Scanner;
import java.util.Random;

public class GamePackage {

    public static int health = 100;
    public static int score = 0;

    public static void main(String[] args) {
        
        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println(); System.out.println();

        startGame();
        clear();
    }

    //Every Scenario happens for the game
    //START HERE

    public static void startGame(){

        Scanner in = new Scanner(System.in);
        System.out.println("You find yourself in a Mysterious Place");
        System.out.println("What is your NEXT STEP?");
        System.out.println("1. Explore a DARK CAVE");
        System.out.println("2. Walk Through the ENCHANTED FOREST");
        System.out.println("Enter your CHOICE: ");

        int choice = in.nextInt();
        System.out.println();

        clear();
        in.close();

    }

    public static void exploreCave(){

        System.out.println("You choose to enter the DARK CAVE and discovered TREASURE CHEST");
        System.out.println("1. Open the TREASURE CHEST");
        System.out.println("2. Ignore the TREASURE CHEST and leave the DARK CAVE");
        System.out.println("Enter your CHOICE: ");

        Scanner in = new Scanner(System.in);

        int choice = in.nextInt();
        System.out.println();System.out.println();

        if (choice == 1){

            System.out.println("You choose to open the TREASURE CHEST");
            int z = exploreRandom();

            if(z == 0){

                System.out.println("You fell for the MIMIC trap & it eats you alive");
                System.out.println("YOU DIED");
                System.out.println("Score Collected: " + score);
                
                pause();
            }
            else{

                System.out.println("You found some GOLD");
                score = score + 100;
                System.out.println("Your Score: " + score);
                System.out.println("You're good to go Ahead");
                pause();
                clear();
                confir();
            }
        }
        else if(choice == 2){

            System.out.println("You ignore the TREASURE CHEST and proceed your Adventure");
            confir();
        }
        else{
            System.out.println("Invalid Choice. Game Over!");
        }

        in.close();

    }

    //Every Scenario happen for the game
    //END HERE

    // Some method inserted to make the output smooth 
    // Start here

    public static void confir(){

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Start New Game");
        System.out.println("2. End The Game");
        System.out.println("Pick the Number: ");

        int number = scan.nextInt();

        if(number == 1){

            startGame();
        }
        else{
            System.out.println("Thanks for Playing!");
            System.out.println("Health Score: " + health);
            System.out.println("Collected Score: " + score);
        }

        pause();
        clear();
    }

    public static int exploreRandom(){

        Random rand = new Random();
        int r = rand.nextInt(2);
        return r;
    }

    public static void pause(){

        Scanner s = new Scanner(System.in);
        s.next();
    }

    public static void clear(){

        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    // Some method inserted to make the output smooth 
    // End here
}
