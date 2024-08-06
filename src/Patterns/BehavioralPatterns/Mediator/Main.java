package Patterns.BehavioralPatterns.Mediator;

/**
 * Mediator - used to reduce the coupling of multiple classes between themselves,
 * by moving these connections into a single mediator class. This allows for simpler interactions between objects,
 * making them more independent and easier to reuse.
 */

public class Main {
    public static void main(String[] args) {
        Alarm alarm = new Alarm(null);
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Curtains curtains = new Curtains();
        Radio radio = new Radio();

        SmartHomeMediator mediator = new SmartHomeMediator(alarm, coffeeMachine, curtains, radio);

        alarm.setMediator(mediator);
        alarm.trigger();
    }
}