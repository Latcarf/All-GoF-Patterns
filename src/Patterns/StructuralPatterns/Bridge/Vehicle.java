package Patterns.StructuralPatterns.Bridge;

abstract class Vehicle {
    protected Workshop assemblyWorkshop;
    protected Workshop paintWorkshop;

    protected Vehicle(Workshop assemblyWorkshop, Workshop paintWorkshop) {
        this.assemblyWorkshop = assemblyWorkshop;
        this.paintWorkshop = paintWorkshop;
    }

    abstract public void manufacture();
}