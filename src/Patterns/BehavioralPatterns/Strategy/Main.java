package Patterns.BehavioralPatterns.Strategy;

/**
 * Strategy - определяет семейство алгоритмов, инкапсулирует каждый из них и обеспечивает их взаимозаменяемость.
 * Это позволяет выбирать алгоритм независимо от клиентских данных во время выполнения программы.
 */

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("1234", 100));
        cart.addItem(new Item("5678", 200));

        cart.setPaymentStrategy(new CreditCardPaymentStrategy("1234567890123456"));
        cart.checkout();

        cart.setPaymentStrategy(new PayPalPaymentStrategy("myemail@example.com", "mypassword"));
        cart.checkout();
    }
}