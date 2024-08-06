package Patterns.StructuralPatterns.Bridge;

/**
 * Bridge - splits one or more classes into two separate hierarchies - abstraction and implementation,
 * allowing them to be modified independently of each other.
 */

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(new AssemblyWorkshop(), new PaintWorkshop());
        car.manufacture();
    }
}
