package setup;

import java.util.Random;

/**
 * Dice class rolls a random number between 1 and 6
 * @author Aubrey Davies
 * @version 1.0
 */
public class Dice {
    private Random roll;

    /**
     * Constructor method for Dice class
     */
    public Dice() {
        roll = new Random();
    }

    /**
     * Roll the dice
     * @return the random number between 1 and 6 the dice rolled
     */
    public int rollDice() {
        return roll.nextInt(6) + 1;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "roll=" + roll +
                '}';
    }
}
