package Patterns.BehavioralPatterns.TemplateMethod;

/**
 * Template Method - определяет скелет алгоритма, перекладывая ответственность за некоторые его шаги на подклассы.
 * Паттерн позволяет подклассам переопределять шаги алгоритма, не меняя его общей структуры.
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