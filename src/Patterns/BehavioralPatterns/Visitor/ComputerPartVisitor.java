package Patterns.BehavioralPatterns.Visitor;

import Patterns.BehavioralPatterns.Visitor.ComputerPart.Keyboard;
import Patterns.BehavioralPatterns.Visitor.ComputerPart.Monitor;
import Patterns.BehavioralPatterns.Visitor.ComputerPart.Mouse;

public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
