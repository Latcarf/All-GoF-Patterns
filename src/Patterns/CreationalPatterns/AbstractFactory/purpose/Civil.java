package Patterns.CreationalPatterns.AbstractFactory.purpose;

import Patterns.CreationalPatterns.AbstractFactory.purpose.Purpose;

public class Civil implements Purpose {
    @Override
    public void printPurpose() {
        System.out.println("For civil purposes.");
    }
}
