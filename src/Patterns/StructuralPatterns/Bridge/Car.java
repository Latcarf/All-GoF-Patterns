package Patterns.StructuralPatterns.Bridge;

class Car extends Vehicle {
    public Car(Workshop assemblyWorkshop, Workshop paintWorkshop) {
        super(assemblyWorkshop, paintWorkshop);
    }
    @Override
    public void manufacture() {
        assemblyWorkshop.work();
        paintWorkshop.work();
    }
}