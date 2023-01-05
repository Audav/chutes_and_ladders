package setup.tiles;

public class Chute extends Tile {

    private int slide;

    public Chute(int tileNumber, int slide) {
        super(tileNumber);
        this.slide = slide;
    }

    public int getSlide() {
        return slide;
    }

    public void setSlide(int slide) {
        this.slide = slide;
    }

    @Override
    public String toString() {
        return "chute: " + getTileNumber() + ", slide to: " + slide;
    }
}
