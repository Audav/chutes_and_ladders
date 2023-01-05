package setup;

/**
 * Player class holds the information of each individual player
 * @author Aubrey Davies
 * @version 1.0
 */
public class Player {

    private String playerName;
    private int currentLocation;

    /**
     * Constructor method for Player class
     * @param playerName the name that will be assigned to the player
     */
    public Player(String playerName) {
        this.playerName = playerName;
        currentLocation = 0;
    }

    /**
     * @return the player's assigned name
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @return the number corresponding to the player's location on the board
     */
    public int getCurrentLocation() {
        return currentLocation;
    }

    /**
     * @param currentLocation the updated location of the player on the board
     */
    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public String toString() {
        return playerName + " is on tile " + currentLocation;
    }
}
