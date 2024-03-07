package Patterns.BehavioralPatterns.Command;

public class TurnOnLightCommand implements Command{
    private Light theLight;

    public TurnOnLightCommand(Light light){
        this.theLight=light;
    }

    public void execute(){
        theLight.turnOn();
    }
}
