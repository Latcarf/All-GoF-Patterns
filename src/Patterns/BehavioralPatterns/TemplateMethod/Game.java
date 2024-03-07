package Patterns.BehavioralPatterns.TemplateMethod;

public abstract class Game {
    public final void play() {
        initializeGame();
        playGame();
        endGame();
        printWinner();
    }

    abstract void initializeGame();
    abstract void playGame();
    abstract void endGame();
    abstract void printWinner();
}
