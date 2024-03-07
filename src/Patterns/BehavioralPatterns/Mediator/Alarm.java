package Patterns.BehavioralPatterns.Mediator;

public class Alarm {
    private Mediator mediator;

    public Alarm(Mediator mediator) {
        this.mediator = mediator;
    }

    public void trigger() {
        mediator.alarmEvent();
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
