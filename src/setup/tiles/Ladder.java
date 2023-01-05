package setup.tiles;

/**
 * Ladder class tells the game which new tile the player will rise up to
 * @author Aubrey Davies
 * @version 1.0
 */
public class Ladder extends Tile {

    private int climb;

    /**
     * Constructor method for Ladder class
     * @param tileNumber the ordered number this tile will be placed in
     * @param climb the tile number the player will move up to
     */
    public Ladder(int tileNumber, int climb) {
        super(tileNumber);
        this.climb = climb;
    }

    /**
     * @return the tile number the player will move up to
     */
    public int getClimb() {
        return climb;
    }

    @Override
    public String toString() {
        return "ladder: " + getTileNumber() + ", climb to: " + climb;
    }
}
