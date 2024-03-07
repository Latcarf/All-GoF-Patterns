package Patterns.CreationalPatterns.AbstractFactory.transport;

import Patterns.CreationalPatterns.AbstractFactory.transport.Transport;

public class Airplane implements Transport {
    @Override
    public void printTransportType() {
        System.out.println("This is a airplane.");
    }
}
