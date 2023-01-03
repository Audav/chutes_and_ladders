package setup.tiles;

public class Ladder extends Tile {

    private int climb;

    public Ladder(int tileNumber, int climb) {
        super(tileNumber);
        this.climb = climb;
    }

    public int getClimb() {
        return climb;
    }

    public void setClimb(int climb) {
        this.climb = climb;
    }

    @Override
    public String toString() {
        return "tile: " + getTileNumber() + ", climb: " + climb;
    }
}
