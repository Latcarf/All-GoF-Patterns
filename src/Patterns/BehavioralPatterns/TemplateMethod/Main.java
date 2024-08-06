package Patterns.BehavioralPatterns.TemplateMethod;

/**
 * Template Method - defines the skeleton of the algorithm, shifting responsibility for some of its steps to subclasses.
 * The pattern allows subclasses to redefine the steps of the algorithm without changing its overall structure.
 */

public class Main {
    public static void main(String[] args) {
        Game chess = new Chess();
        chess.play();

        System.out.println();

        Game monopoly = new Monopoly();
        monopoly.play();
    }
}