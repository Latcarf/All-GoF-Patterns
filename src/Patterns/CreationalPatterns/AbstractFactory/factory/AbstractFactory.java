package Patterns.CreationalPatterns.AbstractFactory.factory;

import Patterns.CreationalPatterns.AbstractFactory.purpose.Purpose;
import Patterns.CreationalPatterns.AbstractFactory.transport.Transport;

public interface AbstractFactory {
    Transport createTransport();
    Purpose createPurpose(Enum purpose);
}
