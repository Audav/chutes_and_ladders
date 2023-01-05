package setup.tiles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * TileConfig class holds specific instructions for which types of tile to assign to each space,
 * and it assembles the board's tile list based on those instructions
 * @author Aubrey Davies
 * @version 1.0
 */
public class TileConfig {

    private ArrayList<Tile> tileList = new ArrayList<>();
    private Map<Integer, Integer> chutes = new HashMap<>();
    private Map<Integer, Integer> ladders = new HashMap<>();

    /**
     * Constructor method for TileConfig class
     */
    public TileConfig() {
        configureChutes();
        configureLadders();
        addTileLoop();
    }

    /**
     * @return the ArrayList of tiles that make up the board
     */
    public ArrayList<Tile> getTileList() {
        return tileList;
    }

    /**
     * assemble the ArrayLast of tiles
     */
    private void addTileLoop() {
        for (int i = 1; i <= 100; i++) {
            if (chutes.containsKey(i)) {
                tileList.add(new Chute(i, chutes.get(i)));
            }
            else if (ladders.containsKey(i)) {
                tileList.add(new Ladder(i, ladders.get(i)));
            }
            else {
                tileList.add(new Tile(i));
            }
        }
    }

    /**
     * assemble a Map containing the tiles that are chutes and which tile they lead to
     */
    private void configureChutes() {
        chutes.put(16, 6); chutes.put(47, 26); chutes.put(49, 11); chutes.put(56, 53); chutes.put(62, 19);
        chutes.put(64, 60); chutes.put(87, 24); chutes.put(93, 73); chutes.put(95, 75); chutes.put(98, 78);
    }

    /**
     * assemble a Map containing the tiles that are ladders and which tile they lead to
     */
    private void configureLadders() {
        ladders.put(1, 38); ladders.put(4, 14); ladders.put(9, 31); ladders.put(21, 42); ladders.put(28, 84);
        ladders.put(36, 44); ladders.put(51, 67); ladders.put(71, 91); ladders.put(80, 100);
    }

    @Override
    public String toString() {
        return "TileConfig{" +
                "tileList=" + tileList +
                ", chutes=" + chutes +
                ", ladders=" + ladders +
                '}';
    }
}
