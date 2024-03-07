package Patterns.BehavioralPatterns.Mediator;

/**
 * Mediator -  используется для уменьшения связности множества классов между собой,
 * путём перемещения этих связей в один класс-посредник. Это позволяет упростить взаимодействие между объектами,
 * делая их более независимыми и упрощая их повторное использование.
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