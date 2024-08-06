package Patterns.CreationalPatterns.AbstractFactory;

import Patterns.CreationalPatterns.AbstractFactory.factory.AirplaneFactory;
import Patterns.CreationalPatterns.AbstractFactory.purpose.PurposeEnum;

/**
 * AbstractFactory is a creational design pattern that allows you to create families of related objects without
 * being tied to the specific classes of objects being created.
 **/

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine(new AirplaneFactory(), PurposeEnum.MILITARY);
        machine.print();
    }
}
