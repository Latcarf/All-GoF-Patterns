package Patterns.BehavioralPatterns.Command;

/**
 * Command - превращает запросы в объекты, позволяя передавать их как аргументы при вызове методов,
 * ставить запросы в очередь, логировать их, а также поддерживать отмену операций.
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