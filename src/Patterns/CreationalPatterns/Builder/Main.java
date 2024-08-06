package Patterns.CreationalPatterns.Builder;

import Patterns.CreationalPatterns.Builder.pizza.MargheritaPizzaBuilder;
import Patterns.CreationalPatterns.Builder.pizza.Pizza;
import Patterns.CreationalPatterns.Builder.pizza.PizzaBuilder;
import Patterns.CreationalPatterns.Builder.pizza.SpicyPizzaBuilder;

/**
 * Builder - allows you to create complex objects step by step
 * with multiple fields and their various combinations.
 */

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        PizzaBuilder margheritaBuilder = new MargheritaPizzaBuilder();
        PizzaBuilder spicyBuilder = new SpicyPizzaBuilder();

        director.setPizzaBuilder(margheritaBuilder);
        director.constructPizza();
        Pizza pizza = director.getPizza();
        System.out.println("Pizza constructed: " + pizza);

        director.setPizzaBuilder(spicyBuilder);
        director.constructPizza();
        pizza = director.getPizza();
        System.out.println("Pizza constructed: " + pizza);
    }
}
