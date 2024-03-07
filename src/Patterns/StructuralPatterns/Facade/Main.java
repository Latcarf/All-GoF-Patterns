package Patterns.StructuralPatterns.Facade;

/**
 * Facade - предоставляет простой (но урезанный) интерфейс к сложной системе объектов, библиотеке или фреймворку.
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