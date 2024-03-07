package Patterns.StructuralPatterns.Adapter;

/**
 * Adapter - это структурный паттерн проектирования, который позволяет объектам с несовместимыми интерфейсами работать вместе.
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