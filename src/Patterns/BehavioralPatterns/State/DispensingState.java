package Patterns.BehavioralPatterns.State;

public class DispensingState implements State {
    private final DrinkMachine machine;

    public DispensingState(DrinkMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectDrink() {
        System.out.println("Please wait, your drink is being dispensed.");
    }

    @Override
    public void dispense() {
        System.out.println("Here is your drink.");
        machine.setState(machine.getIdleState());
    }

    @Override
    public void refill() {
        System.out.println("Cannot refill during dispensing.");
    }
}
