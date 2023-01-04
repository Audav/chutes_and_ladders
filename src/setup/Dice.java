package setup;

import java.util.Random;

public class Dice {
    private Random roll;

    public Dice() {
        roll = new Random();
    }

    public int rollDice() {
        return roll.nextInt(6) + 1;
    }
}
