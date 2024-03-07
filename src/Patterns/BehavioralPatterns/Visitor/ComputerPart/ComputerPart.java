package Patterns.BehavioralPatterns.Visitor.ComputerPart;

import Patterns.BehavioralPatterns.Visitor.ComputerPartVisitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
