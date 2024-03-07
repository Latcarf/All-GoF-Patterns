package Patterns.StructuralPatterns.Facade;

public class SmartHomeFacade {
    private LightingSystem lightingSystem;
    private CoolingSystem coolingSystem;
    private MultimediaSystem multimediaSystem;

    public SmartHomeFacade(LightingSystem lightingSystem, CoolingSystem coolingSystem, MultimediaSystem multimediaSystem) {
        this.lightingSystem = lightingSystem;
        this.coolingSystem = coolingSystem;
        this.multimediaSystem = multimediaSystem;
    }

    public void activateEveningRelaxationMode() {
        System.out.println("Activating the Evening rest mode:");
        lightingSystem.dimLights(30);
        coolingSystem.coolDown();
        multimediaSystem.playMusic();
    }

    public void activateLeaveHomeMode() {
        System.out.println("Activating Leaving Home mode:");
        lightingSystem.turnOff();
        coolingSystem.turnOff();
        multimediaSystem.stopMusic();
    }
}
