package Patterns.CreationalPatterns.AbstractFactory.factory;

import Patterns.CreationalPatterns.AbstractFactory.purpose.Civil;
import Patterns.CreationalPatterns.AbstractFactory.purpose.Military;
import Patterns.CreationalPatterns.AbstractFactory.purpose.Purpose;
import Patterns.CreationalPatterns.AbstractFactory.purpose.PurposeEnum;
import Patterns.CreationalPatterns.AbstractFactory.transport.Car;
import Patterns.CreationalPatterns.AbstractFactory.transport.Transport;

public class CarFactory implements AbstractFactory {
    @Override
    public Transport createTransport() {
        return new Car();
    }

    @Override
    public Purpose createPurpose(Enum purpose) {
        if (purpose.equals(PurposeEnum.CIVIL)) {
            return new Civil();
        } else {
            return new Military();
        }
    }
}
