package Patterns.StructuralPatterns.Facade;

public class LightingSystem {
    public void turnOn() {
        System.out.println("Lighting on");
    }

    public void turnOff() {
        System.out.println("Lights off");
    }

    public void dimLights(int level) {
        System.out.println("Lighting dimmed to level " + level + "%");
    }
}
