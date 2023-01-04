package game;

import setup.Board;
import setup.Dice;

public class GameClient {
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board);

        Dice dice = new Dice();
        System.out.println(dice.rollDice());
    }
}
