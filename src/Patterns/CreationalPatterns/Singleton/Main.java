package Patterns.CreationalPatterns.Singleton;

/**
 * Singleton - ensures that the class has only one instance
 * and provides a global access point to that instance.
 */

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}
