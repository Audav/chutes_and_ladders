package setup;

public class Player {

    private String playerName;
    private int currentLocation;

    public Player(String playerName) {
        this.playerName = playerName;
        currentLocation = 0;
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public String toString() {
        return playerName + " is on tile " + currentLocation;
    }
}
