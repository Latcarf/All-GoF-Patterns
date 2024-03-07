package Patterns.BehavioralPatterns.Visitor.ComputerPart;

import Patterns.BehavioralPatterns.Visitor.ComputerPartVisitor;

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
