package Patterns.StructuralPatterns.Bridge;

/**
 * Bridge - разделяет один или несколько классов на две отдельные иерархии — абстракцию и реализацию,
 * позволяя изменять их независимо друг от друга.
 */
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(new AssemblyWorkshop(), new PaintWorkshop());
        car.manufacture();
    }
}
