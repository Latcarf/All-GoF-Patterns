package Patterns.StructuralPatterns.Composite;

/**
 * Composite — позволяет сгруппировать множество объектов в древовидную структуру,
 * а затем работать с ней так, как будто это единичный объект.
 */

public class Main {
    public static void main(String[] args) {
        Graphic circle1 = new Circle();
        Graphic circle2 = new Circle();
        Graphic rectangle = new Rectangle();

        CompositeGraphic compositeGraphic = new CompositeGraphic();
        compositeGraphic.add(circle1);
        compositeGraphic.add(circle2);
        compositeGraphic.add(rectangle);

        compositeGraphic.draw();
    }
}