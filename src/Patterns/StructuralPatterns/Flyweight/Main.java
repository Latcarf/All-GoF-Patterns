package Patterns.StructuralPatterns.Flyweight;

/**
 * Flyweight - allows you to fit more objects into the allocated RAM.
 * Flyweight saves memory by sharing the common state of objects among themselves,
 * instead of storing the same data in each object.
 */

public class Main {
    public static void main(String[] args) {
        FormattingFactory factory = new FormattingFactory();

        TextFormatting formatting1 = factory.getFormatting("Arial", 12, "Red");
        TextFormatting formatting2 = factory.getFormatting("Arial", 12, "Red");

        System.out.println(formatting1 == formatting2);

        Character c1 = new Character('A', formatting1);
        Character c2 = new Character('B', formatting2);

        c1.print();
        c2.print();
    }
}