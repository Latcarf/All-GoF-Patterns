package Patterns.CreationalPatterns.AbstractFactory;

import Patterns.CreationalPatterns.AbstractFactory.factory.AbstractFactory;
import Patterns.CreationalPatterns.AbstractFactory.purpose.Purpose;
import Patterns.CreationalPatterns.AbstractFactory.transport.Transport;

public class Machine {
    private Transport transport;
    private Purpose purpose;

    public Machine(AbstractFactory factory, Enum purpose) {
        transport = factory.createTransport();
        this.purpose = factory.createPurpose(purpose);
    }

    public void print() {
        transport.printTransportType();
        purpose.printPurpose();
    }
}