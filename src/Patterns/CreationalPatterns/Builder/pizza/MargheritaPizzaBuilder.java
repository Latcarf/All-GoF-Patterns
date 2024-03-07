package Patterns.CreationalPatterns.Builder.pizza;

public class MargheritaPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("regular");
    }

    public void buildSauce() {
        pizza.setSauce("tomato");
    }

    public void buildTopping() {
        pizza.setTopping("cheese");
    }
}