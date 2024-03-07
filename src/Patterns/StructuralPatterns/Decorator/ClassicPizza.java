package Patterns.StructuralPatterns.Decorator;


public class ClassicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Classic Pizza";
    }

    @Override
    public double getCost() {
        return 25.00;
    }
}