package setup.tiles;

public class Tile {

    private int tileNumber;

    public Tile(int tileNumber) {
        this.tileNumber = tileNumber;
    }

    public int getTileNumber() {
        return tileNumber;
    }

    public void setTileNumber(int tileNumber) {
        this.tileNumber = tileNumber;
    }

    @Override
    public String toString() {
        return "tile: " + tileNumber;
    }
}
