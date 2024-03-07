package Patterns.StructuralPatterns.Bridge;

class AssemblyWorkshop implements Workshop {
    public void work() {
        System.out.print("The car is being assembled.\n");
    }
}