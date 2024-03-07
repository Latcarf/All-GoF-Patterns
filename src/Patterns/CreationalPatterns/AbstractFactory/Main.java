package Patterns.CreationalPatterns.AbstractFactory;

import Patterns.CreationalPatterns.AbstractFactory.factory.AirplaneFactory;
import Patterns.CreationalPatterns.AbstractFactory.purpose.PurposeEnum;

/**
 * AbstractFactory — это порождающий паттерн проектирования, который позволяет создавать семейства связанных объектов,
 * не привязываясь к конкретным классам создаваемых объектов.
 **/

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine(new AirplaneFactory(), PurposeEnum.MILITARY);
        machine.print();
    }
}
