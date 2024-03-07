package Patterns.StructuralPatterns.Flyweight;

/**
 * Flyweight - позволяет вместить бóльшее количество объектов в отведённую оперативную память.
 * Легковес экономит память, разделяя общее состояние объектов между собой,
 * вместо хранения одинаковых данных в каждом объекте.
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