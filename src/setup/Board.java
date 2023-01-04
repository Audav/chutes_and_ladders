package setup;

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
