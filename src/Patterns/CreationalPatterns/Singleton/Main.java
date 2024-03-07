package Patterns.CreationalPatterns.Singleton;

/**
 * Singleton - гарантирует, что класс имеет только один экземпляр
 * и предоставляет глобальную точку доступа к этому экземпляру.
 */

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}
