package Patterns.BehavioralPatterns.Interpreter;

/**
 * Interpreter - used to define a grammatical representation for a language and provide an interpreter
 * that uses that representation to interpret expressions in the language.
 * Often used to parse and execute simple language constructs or to handle common tasks involving interpretation.
 */

public class Main {
    public static void main(String[] args) {
        Expression expression = new SubtractExpression(
                        new AddExpression(
                        new NumberExpression(1),
                        new NumberExpression(2)),
                        new NumberExpression(3));

        System.out.println("Result 1 + 2 - 3 = " + expression.interpret());
    }
}