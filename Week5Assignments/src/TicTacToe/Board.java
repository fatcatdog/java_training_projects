package TicTacToe;

public class Board {
String[] positions;

    public Board()
    {
        this.positions = new String[9];
        for(int i = 0; i < 9; i++) {
            positions[i] = String.valueOf(i + 1);
        }
    }

}
