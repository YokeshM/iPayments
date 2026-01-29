package org.example;

public class PaymentSystem {
    public static void main(String[] args) {
        // We use the INTERFACE as the type (Abstraction)
        // This hides whether it's Stripe or PayPal from the main logic.
        IPaymentProcessor processor;

        System.out.println("--- Testing Stripe ---");
        processor = new StripeProcessor();
        processor.processPayment(250.0);

        System.out.println("\n--- Testing PayPal ---");
        processor = new PaypalProcessor();
        processor.processPayment(500.0);
}}
