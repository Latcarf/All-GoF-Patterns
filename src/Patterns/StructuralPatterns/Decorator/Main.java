package Patterns.StructuralPatterns.Decorator;

/**
 * Decorator - It allows you to dynamically add new functionality to objects,
 * without changing their source code.
 */

public class Main {
    public static void main(String[] args) {
        Pizza classicPizza = new ClassicPizza();
        classicPizza = new CheeseDecorator(classicPizza);
        System.out.println(classicPizza.getDescription() + ": $" + classicPizza.getCost());
    }
}
