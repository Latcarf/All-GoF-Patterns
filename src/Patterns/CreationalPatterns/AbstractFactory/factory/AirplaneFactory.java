package Patterns.CreationalPatterns.AbstractFactory.factory;

import Patterns.CreationalPatterns.AbstractFactory.purpose.Civil;
import Patterns.CreationalPatterns.AbstractFactory.purpose.Military;
import Patterns.CreationalPatterns.AbstractFactory.purpose.Purpose;
import Patterns.CreationalPatterns.AbstractFactory.purpose.PurposeEnum;
import Patterns.CreationalPatterns.AbstractFactory.transport.Airplane;
import Patterns.CreationalPatterns.AbstractFactory.transport.Transport;

public class AirplaneFactory implements AbstractFactory {
    @Override
    public Transport createTransport() {
        return new Airplane();
    }

    @Override
    public Purpose createPurpose(Enum purpose) {
        if (purpose.equals(PurposeEnum.MILITARY)) {
            return new Military();
        } else {
            return new Civil();
        }
    }
}
