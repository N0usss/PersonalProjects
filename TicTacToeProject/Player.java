package TicTacToeProject;

//Switching player using lambda expression
public class Player {
    
    private String turn;

    public Player() {
        this.turn = "X";
    }

    public String getTurn() {
        return turn;
    }

    public void switchTurn() {
        turn = turn.equals("X") ? "O" : "X";
    }
}
