package Patterns.BehavioralPatterns.State;

public class DrinkMachine {
    private State idleState;
    private State dispensingState;

    private State state;

    public DrinkMachine() {
        idleState = new IdleState(this);
        dispensingState = new DispensingState(this);

        state = idleState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void selectDrink() {
        state.selectDrink();
    }

    public void dispenseDrink() {
        state.dispense();
    }

    public void refill() {
        state.refill();
    }

    public State getIdleState() {
        return idleState;
    }

    public State getDispensingState() {
        return dispensingState;
    }
}
