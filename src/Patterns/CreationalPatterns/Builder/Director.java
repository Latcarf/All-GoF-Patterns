package Patterns.CreationalPatterns.Builder;

import Patterns.CreationalPatterns.Builder.pizza.Pizza;
import Patterns.CreationalPatterns.Builder.pizza.PizzaBuilder;

public class Director {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
