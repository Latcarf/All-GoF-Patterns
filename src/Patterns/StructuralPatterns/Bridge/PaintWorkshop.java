package Patterns.StructuralPatterns.Bridge;

class PaintWorkshop implements Workshop {
    public void work() {
        System.out.print("The car is being painted.\n");
    }
}