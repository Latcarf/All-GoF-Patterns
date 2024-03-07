package Patterns.BehavioralPatterns.TemplateMethod;

public class Monopoly extends Game {
    @Override
    void initializeGame() {
        System.out.println("Monopoly game initialized!");
    }

    @Override
    void playGame() {
        System.out.println("Playing Monopoly...");
    }

    @Override
    void endGame() {
        System.out.println("Game over! Thanks for playing.");
    }

    @Override
    void printWinner() {
        System.out.println("The winner is Player 2");
    }
}

