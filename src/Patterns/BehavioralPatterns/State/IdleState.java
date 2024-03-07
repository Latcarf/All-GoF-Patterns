package Patterns.BehavioralPatterns.State;

public class IdleState implements State {
    private final DrinkMachine machine;

    public IdleState(DrinkMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectDrink() {
        System.out.println("Drink selected.");
        machine.setState(machine.getDispensingState());
    }

    @Override
    public void dispense() {
        System.out.println("Please select a drink first.");
    }

    @Override
    public void refill() {
        System.out.println("Machine is refilled.");
    }
}
