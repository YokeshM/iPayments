package org.example;

public class StripeProcessor extends BaseProcessor implements IPaymentProcessor{
    // 3. CONCRETE IMPLEMENTATION: STRIPE
    @Override
    public void connectToAPI(){
        System.out.println("Stripe:Establishing secure SSL connection");
    }

    @Override
    public void processPayment(double amount) throws PaymentException{
        if (amount<=0){
            throw new PaymentException("Invalid amount"+ amount);
        }
        connectToAPI();
        System.out.println("Stripe:charging credit card for $"+ amount);
        logTransaction("Stripe", amount);
    }

}
