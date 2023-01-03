package setup;

import setup.tiles.Chute;
import setup.tiles.Ladder;
import setup.tiles.Tile;

import java.util.ArrayList;

public class Board {

    private ArrayList<Tile> board;

    public Board() {
        board = new ArrayList<>();
        addTiles();
    }

    private void addTiles() {
        board.add(new Tile(1));
        board.add(new Tile(2));
        board.add(new Ladder(3, 2));
        board.add(new Chute(4, 2));
        board.add(new Tile(5));
        board.add(new Tile(6));
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
