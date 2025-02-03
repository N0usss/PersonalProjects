package TicTacToeProject;

import java.util.Scanner;

public class TicTacToe{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        GameLogic gameLogic = new GameLogic(board);
        Player player = new Player();
        String winner = null;

        System.out.println("Welcome to Tic Tac Toe!");
        board.printBoard();

        while (winner == null) {
            System.out.println(player.getTurn() + "'s turn; enter a slot number:");
            int numInput = 0;

            try {
                numInput = scanner.nextInt();
                if (numInput < 1 || numInput > 9 || !board.isSlotAvailable(numInput)) {
                    System.out.println("Invalid input; re-enter slot number");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Invalid input; re-enter slot number");
                scanner.next(); // Clear invalid input
                continue;
            }

            board.placeMove(numInput, player.getTurn());
            board.printBoard();
            winner = gameLogic.checkWinner();

            if (winner == null) {
                player.switchTurn();
            }
        }

        if (winner.equals("draw")) {
            System.out.println("It's a draw! Thanks for playing.");
        } else {
            System.out.println("Congratulations! " + winner + " wins!");
        }

        scanner.close();
    }
}