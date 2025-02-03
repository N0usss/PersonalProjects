package TicTacToeProject;

public class GameLogic {
    
    private Board board;

    public GameLogic(Board board) {
        this.board = board;
    }

    public String checkWinner() {
        String[] b = board.getBoard();
        String[][] winningConditions = {
            {b[0], b[1], b[2]}, {b[3], b[4], b[5]}, {b[6], b[7], b[8]},
            {b[0], b[3], b[6]}, {b[1], b[4], b[7]}, {b[2], b[5], b[8]},
            {b[0], b[4], b[8]}, {b[2], b[4], b[6]}
        };

        for (String[] line : winningConditions) {
            if (line[0].equals(line[1]) && line[1].equals(line[2])) {
                return line[0]; // Winner found
            }
        }

        // Check for a draw
        for (int i = 1; i <= 9; i++) {
            if (board.isSlotAvailable(i)) {
                return null; // Game still ongoing
            }
        }

        return "draw"; // No empty spaces left
    }
}
