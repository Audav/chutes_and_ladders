package setup;

import setup.tiles.Chute;
import setup.tiles.Ladder;
import setup.tiles.Tile;

import console.InputConsole;
import java.util.ArrayList;

public class Game {

    private ArrayList<Player> playerList = new ArrayList<>();
    private Board board = new Board();
    Dice die = new Dice();

    public Game() {
        gameLoop();
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

    public void gameLoop() {
        boolean winCondition = false;
        int roll;
        playerCount();
        while (!winCondition) {
            for (int i = 0; i < playerList.size(); i++) {
                System.out.println();
                System.out.println(playerList.get(i).getPlayerName() + "'s turn!");
                roll = die.rollDice();
                System.out.println(playerList.get(i).getPlayerName() + " rolled a " + roll);
                playerList.get(i).setCurrentLocation(playerList.get(i).getCurrentLocation() + roll);
                System.out.println(playerList.get(i).getPlayerName() + " landed on tile " + playerList.get(i).getCurrentLocation());
                if (board.getTile(playerList.get(i).getCurrentLocation()) instanceof Chute) {
                    System.out.println("Tile " + playerList.get(i).getCurrentLocation() + " is a chute!");
                    playerList.get(i).setCurrentLocation(board.getSlide(playerList.get(i).getCurrentLocation()));
                    System.out.println(playerList.get(i).getPlayerName() + " slid down to tile " + playerList.get(i).getCurrentLocation());
                }
                if (board.getTile(playerList.get(i).getCurrentLocation()) instanceof Ladder) {
                    System.out.println("Tile " + playerList.get(i).getCurrentLocation() + " is a ladder!");
                    playerList.get(i).setCurrentLocation(board.getClimb(playerList.get(i).getCurrentLocation()));
                    System.out.println(playerList.get(i).getPlayerName() + " climbed up to tile " + playerList.get(i).getCurrentLocation());
                }
                if (isGameOver(playerList.get(i))) {
                    winCondition = true;
                    break;
                }
            }
        }
    }

    private boolean isGameOver(Player currentPlayer) {
        return currentPlayer.getCurrentLocation() >= 100;
    }
}
