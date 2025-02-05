package TicTacToeGame;

//A display for tic tac toe game
public class Board {
    
    private String[] board;

    public Board() {
        board = new String[9];
        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }
    }

    public void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    public boolean isSlotAvailable(int slot) {
        return board[slot - 1].equals(String.valueOf(slot));
    }

    public void placeMove(int slot, String player) {
        board[slot - 1] = player;
    }

    public String[] getBoard() {
        return board;
    }
}
