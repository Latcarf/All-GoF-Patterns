package Patterns.StructuralPatterns.Decorator;

/**
 * Decorator - Он позволяет динамически добавлять новую функциональность к объектам,
 * не изменяя их исходный код.
 */

public class Main {
    public static void main(String[] args) {
        Pizza classicPizza = new ClassicPizza();
        classicPizza = new CheeseDecorator(classicPizza);
        System.out.println(classicPizza.getDescription() + ": $" + classicPizza.getCost());
    }
}
