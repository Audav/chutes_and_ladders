package game;

import setup.Game;

/**
 * Driver class for Chutes and Ladders
 * @author Aubrey Davies
 * @version 1.0
 */
public class GameClient {

    /**
     * The entry point of the application.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Game newGame = new Game();
        newGame.runGame();
    }
}
