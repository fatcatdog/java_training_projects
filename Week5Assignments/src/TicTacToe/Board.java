/*
@author Jacob Duchen
*/

package TicTacToe;
//i wanted to create a board in a different class to get more experience interacting with multiple classes

public class Board {
String[] positions;

    public Board()
    {
        //each position will be a string 1-9, note that the actual index if -1 of string put out
        this.positions = new String[9];
        for(int i = 0; i < 9; i++) {
            positions[i] = String.valueOf(i + 1);
        }
    }

}
