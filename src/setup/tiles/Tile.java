package setup.tiles;

/**
 * Tile class is a generic tile
 * @author Aubrey Davies
 * @version 1.0
 */
public class Tile {

    private int tileNumber;

    /**
     * Constructor method for Tile class
     * @param tileNumber the ordered number this tile will be placed in
     */
    public Tile(int tileNumber) {
        this.tileNumber = tileNumber;
    }

    /**
     * @return the tile's ordered number
     */
    public int getTileNumber() {
        return tileNumber;
    }

    @Override
    public String toString() {
        return "tile: " + tileNumber;
    }
}
