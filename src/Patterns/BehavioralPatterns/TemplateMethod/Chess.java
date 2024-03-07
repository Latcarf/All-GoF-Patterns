package Patterns.BehavioralPatterns.TemplateMethod;

public class Chess extends Game {
    @Override
    void initializeGame() {
        System.out.println("Chess game initialized!");
    }

    @Override
    void playGame() {
        System.out.println("Playing chess...");
    }

    @Override
    void endGame() {
        System.out.println("Game over!");
    }

    @Override
    void printWinner() {
        System.out.println("The winner is Player 1");
    }
}
