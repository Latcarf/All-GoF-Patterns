package Patterns.BehavioralPatterns.Visitor;

import Patterns.BehavioralPatterns.Visitor.ComputerPart.ComputerPart;

/**
 * Visitor - позволяет добавлять новые операции к объектам без изменения классов этих объектов.
 * Это полезно, когда необходимо выполнить операции над различными элементами сложной структуры объектов,
 * например, дерева.
 */

public class Main {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}