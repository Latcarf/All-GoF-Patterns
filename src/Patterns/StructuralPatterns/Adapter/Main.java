package Patterns.StructuralPatterns.Adapter;

/**
 * Adapter is a structural design pattern that allows objects with incompatible interfaces to work together.
 */

public class Main {
    public static void main(String[] args) {

        AmericanPlug americanPlug = new AmericanPlug();
        americanPlug.insertIntoAmericanSocket();

        System.out.println("🔌🔌🔌🔌🔌🔌🔌🔌🔌🔌");

        EuropeanPlug europeanPlug = new EuropeanPlug();
        AmericanPlug adapter = new EuropeanToAmericanPlugAdapter(europeanPlug);
        adapter.insertIntoAmericanSocket();
    }
}