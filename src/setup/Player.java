package setup;

/**
 * Player class holds the information of each individual player
 * @author Aubrey Davies
 * @version 1.0
 */
public class Player {

    private String playerName;
    private int playerNumber;
    private int currentLocation;

    /**
     * Constructor method for Player class
     * @param playerName the name that will be assigned to the player
     * @param playerNumber the number corresponding to the order the player plays in
     */
    public Player(String playerName, int playerNumber) {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        currentLocation = 0;
    }

    /**
     * @return the player's assigned name in blue, red, green, or yellow depending on the player number
     */
    public String getPlayerName() {
        switch (playerNumber) {
            case 1: return "\033[0;34m" + playerName + "\033[0m";
            case 2: return "\033[0;31m" + playerName + "\033[0m";
            case 3: return "\033[0;32m" + playerName + "\033[0m";
            case 4: return "\033[0;33m" + playerName + "\033[0m";
        }
        return null;
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
