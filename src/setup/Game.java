package setup;

import setup.tiles.Tile;

import console.InputConsole;
import java.util.ArrayList;

public class Game {

    private ArrayList<Player> playerList = new ArrayList<>();
    private ArrayList<Tile> board = new ArrayList<>();

    public Game() {
        Dice die = new Dice();
        initializeBoard();
        playerCount();
    }

    private void initializeBoard() {
        Board newBoard = new Board();
        board = newBoard.getBoard();
    }

    public void playerCount() {
        System.out.println("How many players? 2, 3, or 4?");
        int count = InputConsole.getInt();
        count = threeMenu(count);
        for (int i = 1; i < count + 1; i++) {
            playerList.add(new Player("Player " + i));
        }
    }

    public int threeMenu(int selection) {
        while (selection > 4 || selection < 2) { //if the user enters a value greater than 4 or less than 2
            selection = InputConsole.getInt("Invalid input. Please re-enter: "); //get user's menu selection again
        }
        return selection;
    }
}
