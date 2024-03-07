package Patterns.BehavioralPatterns.Interpreter;

/**
 * Interpreter - используется для определения грамматического представления для языка и предоставления интерпретатора,
 * который использует это представление для интерпретации выражений в языке.
 * Часто применяется для разбора и выполнения простых языковых конструкций или для обработки часто встречающихся задач, связанных с интерпретацией.
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