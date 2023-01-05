package setup.tiles;

/**
 * Chute class tells the game which new tile the player will fall down to
 * @author Aubrey Davies
 * @version 1.0
 */
public class Chute extends Tile {

    private int slide;

    /**
     * Constructor method for Chute class
     * @param tileNumber the ordered number this tile will be placed in
     * @param slide the tile number the player will move down to
     */
    public Chute(int tileNumber, int slide) {
        super(tileNumber);
        this.slide = slide;
    }

    /**
     * @return the tile number the player will move down to
     */
    public int getSlide() {
        return slide;
    }

    @Override
    public String toString() {
        return "chute: " + getTileNumber() + ", slide to: " + slide;
    }
}
