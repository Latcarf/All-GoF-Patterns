package Patterns.BehavioralPatterns.Strategy;

public class PayPalPaymentStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public PayPalPaymentStrategy(String email, String pwd) {
        this.emailId = email;
        this.password = pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}
