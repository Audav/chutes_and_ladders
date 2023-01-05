package setup;

import setup.tiles.Chute;
import setup.tiles.Ladder;
import setup.tiles.Tile;
import setup.tiles.TileConfig;

import java.util.ArrayList;

/**
 * Board class holds ordered list of Chute, Ladder, and regular tiles
 * @author Aubrey Davies
 * @version 1.0
 */
public class Board {

    private ArrayList<Tile> board;

    /**
     * Constructor method for Board class
     */
    public Board() {
        board = initializeBoard();
    }

    /**
     * @param tileNumber the tile number taken from the current player
     * @return the Tile assigned to the given number
     */
    public Tile getTile(int tileNumber) {
        return board.get(tileNumber - 1);
    }

    /**
     * @param tileNumber the tile number taken from the current player
     * @return the tile number the player will move down to
     */
    public int getSlide(int tileNumber) {
        Chute tempChute = (Chute) board.get(tileNumber - 1);
        return tempChute.getSlide();
    }

    /**
     * @param tileNumber the tile number taken from the current player
     * @return the tile number the player will move up to
     */
    public int getClimb(int tileNumber) {
        Ladder tempLadder = (Ladder) board.get(tileNumber - 1);
        return tempLadder.getClimb();
    }

    /**
     * assemble the board tiles
     */
    private ArrayList<Tile> initializeBoard() {
        TileConfig newBoard = new TileConfig();
        return newBoard.getTileList();
    }

    @Override
    public String toString() {
        StringBuilder printBoard = new StringBuilder();
        for (Tile tile : board) {
            printBoard.append(tile.toString()).append("\n");
        }
        return printBoard.toString();
    }
}
