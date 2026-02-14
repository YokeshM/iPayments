package org.example;
// 1. THE INTERFACE (The Contract)
// Defines what any payment method MUST be able to do.
public interface IPaymentProcessor {
    void processPayment(double amount) throws PaymentException;
}
