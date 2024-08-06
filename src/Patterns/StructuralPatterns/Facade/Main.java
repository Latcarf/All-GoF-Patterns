package Patterns.StructuralPatterns.Facade;

/**
 * Facade - provides a simple (but stripped-down) interface to a complex object system, library, or framework.
 */

public class Main {
    public static void main(String[] args) {
        LightingSystem lightingSystem = new LightingSystem();
        CoolingSystem coolingSystem = new CoolingSystem();
        MultimediaSystem multimediaSystem = new MultimediaSystem();

        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(lightingSystem, coolingSystem, multimediaSystem);

        System.out.println("Morning");
        smartHomeFacade.activateEveningRelaxationMode();

        System.out.println("-----------------------");

        System.out.println("Night");
        smartHomeFacade.activateLeaveHomeMode();
    }
}