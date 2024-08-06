package Patterns.BehavioralPatterns.Command;

/**
 * Command - turns requests into objects, allowing them to be passed as arguments when calling methods,
 * queue requests, log them, and support cancellation of operations.
 */

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command switchUp = new TurnOnLightCommand(light);
        Command switchDown = new TurnOffLightCommand(light);

        Switch newSwitch = new Switch(switchUp, switchDown);

        newSwitch.flipUp();
        newSwitch.flipDown();
    }
}