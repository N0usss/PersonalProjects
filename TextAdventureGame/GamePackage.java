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

    public static void startGame(){

        Scanner in = new Scanner(System.in);
        System.out.println("You find yourself in a Mysterious Place");
        System.out.println("What is your NEXT STEP?");
        System.out.println("1. Explore a Dark, Terrifying Cave");
        System.out.println("2. Walk Through the Enchanted Forest");
        System.out.println("Enter your CHOICE: ");

        int choice = in.nextInt();
        System.out.println();

        clear();

    }

    public static void exploreCave(){

        System.out.println("You find yourself in a Mysterious Place");
    }

    public static void clear(){

        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
}
