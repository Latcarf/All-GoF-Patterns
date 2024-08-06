package Patterns.BehavioralPatterns.Strategy;

/**
 * Strategy - defines a family of algorithms, encapsulates each of them, and ensures their interchangeability.
 * This allows the algorithm to be selected independently of client data during program execution.
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