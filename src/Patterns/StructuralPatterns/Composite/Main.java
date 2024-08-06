package Patterns.StructuralPatterns.Composite;

/**
 * Composite - allows you to group multiple objects into a tree structure,
 * and then work with it as if it were a single object.
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