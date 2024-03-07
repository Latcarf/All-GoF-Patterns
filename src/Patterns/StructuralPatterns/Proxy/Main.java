package Patterns.StructuralPatterns.Proxy;

/**
 * Proxy - предоставляет заместителя или заполнитель для другого объекта, чтобы контролировать доступ к нему.
 * Это может быть полезно для реализации ленивой инициализации, контроля доступа, логирования, мониторинга,
 * управления сетевыми соединениями и т.д.
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