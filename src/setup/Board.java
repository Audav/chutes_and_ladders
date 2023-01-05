package setup;

import setup.tiles.Chute;
import setup.tiles.Ladder;
import setup.tiles.Tile;
import setup.tiles.TileConfig;

import java.util.ArrayList;

public class Board {

    private ArrayList<Tile> board;

    public Board() {
        board = initializeBoard();
    }

    public ArrayList<Tile> getBoard() {
        return board;
    }

    public Tile getTile(int tileNumber) {
        return board.get(tileNumber - 1);
    }

    public int getSlide(int tileNumber) {
        Chute tempChute = (Chute) board.get(tileNumber - 1);
        return tempChute.getSlide();
    }

    public int getClimb(int tileNumber) {
        Ladder tempLadder = (Ladder) board.get(tileNumber - 1);
        return tempLadder.getClimb();
    }

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
