package setup;

import setup.tiles.Chute;
import setup.tiles.Ladder;
import console.InputConsole;
import java.util.ArrayList;

/**
 * Game class runs the game of Chutes and Ladders
 * @author Aubrey Davies
 * @version 1.0
 */
public class Game {

    private ArrayList<Player> playerList = new ArrayList<>();
    private Board board = new Board();
    private Dice die = new Dice();

    /**
     * Constructor method for Game class, asks the number of players
     */
    public Game() {
        playerCount();
    }

    /**
     * Ask how many players between 2 and 4 will participate
     */
    public void playerCount() {
        System.out.println("How many players? 2, 3, or 4?");
        int count = InputConsole.getInt();
        count = threeMenu(count);
        for (int i = 1; i < count + 1; i++) {
            playerList.add(new Player("Player " + i));
        }
    }

    /**
     * threeMenu will keep looping until a valid input is given
     * @param selection the input given by the user
     * @return a valid input
     */
    public int threeMenu(int selection) {
        while (selection > 4 || selection < 2) { //if the user enters a value greater than 4 or less than 2
            selection = InputConsole.getInt("Invalid input. Please re-enter: "); //get user's menu selection again
        }
        return selection;
    }

    /**
     * Run the game
     */
    public void runGame() {
        boolean winCondition = false;
        while (!winCondition) {
            for (int i = 0; i < playerList.size(); i++) {
                movePlayer(i);
                if (board.getTile(playerList.get(i).getCurrentLocation()) instanceof Chute) { slideChute(i); }
                if (board.getTile(playerList.get(i).getCurrentLocation()) instanceof Ladder) { climbLadder(i); }
                if (isGameOver(playerList.get(i))) {
                    winCondition = true;
                    break;
                }
            }
        }
    }

    /**
     * a player will roll the dice and move up to six tiles
     */
    private void movePlayer(int tileNum) {
        System.out.println();
        System.out.println(playerList.get(tileNum).getPlayerName() + "'s turn!");
        int roll = die.rollDice();
        System.out.println(playerList.get(tileNum).getPlayerName() + " rolled a " + roll);
        playerList.get(tileNum).setCurrentLocation(playerList.get(tileNum).getCurrentLocation() + roll);
        System.out.println(playerList.get(tileNum).getPlayerName() +
                " landed on tile " + playerList.get(tileNum).getCurrentLocation());
    }

    /**
     * check if a player has reached tile 100
     */
    private boolean isGameOver(Player currentPlayer) {
        return currentPlayer.getCurrentLocation() >= 100;
    }

    /**
     * if the tile the player landed on is a chute, move them accordingly
     */
    private void slideChute(int tileNum) {
        System.out.println("Tile " + playerList.get(tileNum).getCurrentLocation() + " is a chute!");
        playerList.get(tileNum).setCurrentLocation(board.getSlide(playerList.get(tileNum).getCurrentLocation()));
        System.out.println(playerList.get(tileNum).getPlayerName() +
                " slid down to tile " + playerList.get(tileNum).getCurrentLocation());
    }

    /**
     * if the tile the player landed on is a ladder, move them accordingly
     */
    private void climbLadder(int tileNum) {
        System.out.println("Tile " + playerList.get(tileNum).getCurrentLocation() + " is a ladder!");
        playerList.get(tileNum).setCurrentLocation(board.getClimb(playerList.get(tileNum).getCurrentLocation()));
        System.out.println(playerList.get(tileNum).getPlayerName() +
                " climbed up to tile " + playerList.get(tileNum).getCurrentLocation());
    }

    @Override
    public String toString() {
        return "Game{" +
                "playerList=" + playerList +
                ", board=" + board +
                ", die=" + die +
                '}';
    }
}
