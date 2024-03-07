package Patterns.BehavioralPatterns.Mediator;

public class SmartHomeMediator implements Mediator {
    private Alarm alarm;
    private CoffeeMachine coffeeMachine;
    private Curtains curtains;
    private Radio radio;

    public SmartHomeMediator(Alarm alarm, CoffeeMachine coffeeMachine, Curtains curtains, Radio radio) {
        this.alarm = alarm;
        this.coffeeMachine = coffeeMachine;
        this.curtains = curtains;
        this.radio = radio;
    }

    @Override
    public void alarmEvent() {
        System.out.println("Alarm triggered...");
        coffeeMachine.start();
        curtains.open();
        radio.turnOn();
    }
}
