package setup.tiles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TileConfig {

    private ArrayList<Tile> tileList = new ArrayList<>();
    private Map<Integer, Integer> chutes = new HashMap<>();
    private Map<Integer, Integer> ladders = new HashMap<>();

    public TileConfig() {
        configureChutes();
        configureLadders();
        addTileLoop();
    }

    public ArrayList<Tile> getTileList() {
        return tileList;
    }

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

    private void configureChutes() {
        chutes.put(16, 6); chutes.put(47, 26); chutes.put(49, 11); chutes.put(56, 53); chutes.put(62, 19);
        chutes.put(64, 60); chutes.put(87, 24); chutes.put(93, 73); chutes.put(95, 75); chutes.put(98, 78);
    }

    private void configureLadders() {
        ladders.put(1, 38); ladders.put(4, 14); ladders.put(9, 31); ladders.put(21, 42); ladders.put(28, 84);
        ladders.put(36, 44); ladders.put(51, 67); ladders.put(71, 91); ladders.put(80, 100);
    }
}
