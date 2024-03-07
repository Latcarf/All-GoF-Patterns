package Patterns.BehavioralPatterns.Visitor.ComputerPart;

import Patterns.BehavioralPatterns.Visitor.ComputerPartVisitor;

public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}