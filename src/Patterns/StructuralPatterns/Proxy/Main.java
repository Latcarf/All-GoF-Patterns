package Patterns.StructuralPatterns.Proxy;

/**
 * Proxy - Provides a proxy or placeholder for another object to control access to it.
 * This can be useful for implementing lazy initialization, access control, logging, monitoring,
 * network connection management, etc.
 */

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("test_10mb.jpg");
        Image image2 = new ProxyImage("test_20mb.jpg");

        image1.display();
        System.out.println("");

        image1.display();
        System.out.println("");

        image2.display();
    }
}