package Patterns.BehavioralPatterns.State;

/**
 * State - allows an object to change its behavior depending on its state.
 * This is achieved by switching between different state objects,
 * each of which encapsulates a specific behavior.
 * From the outside, it appears that the class of the object has changed.
 */

public class Main {
    public static void main(String[] args) {
        DrinkMachine machine = new DrinkMachine();

        machine.selectDrink();
        machine.dispenseDrink();

        machine.dispenseDrink();
    }
}
