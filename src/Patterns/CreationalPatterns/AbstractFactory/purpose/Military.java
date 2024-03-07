package Patterns.CreationalPatterns.AbstractFactory.purpose;

import Patterns.CreationalPatterns.AbstractFactory.purpose.Purpose;

public class Military implements Purpose {
    @Override
    public void printPurpose() {
        System.out.println("For military purposes.");
    }
}
