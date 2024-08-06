package Patterns.BehavioralPatterns.Visitor;

import Patterns.BehavioralPatterns.Visitor.ComputerPart.ComputerPart;

/**
 * Visitor - allows you to add new operations to objects without changing the classes of these objects.
 * This is useful when you need to perform operations on various elements of a complex structure of objects,
 * for example, a tree.
 */

public class Main {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}