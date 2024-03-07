package Patterns.BehavioralPatterns.Visitor;

import Patterns.BehavioralPatterns.Visitor.ComputerPart.ComputerPart;
import Patterns.BehavioralPatterns.Visitor.ComputerPart.Keyboard;
import Patterns.BehavioralPatterns.Visitor.ComputerPart.Monitor;
import Patterns.BehavioralPatterns.Visitor.ComputerPart.Mouse;

public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}