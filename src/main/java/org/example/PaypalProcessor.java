package org.example;

public class PaypalProcessor extends BaseProcessor implements IPaymentProcessor{
    @Override
    public void connectToAPI(){
        System.out.println("Paypal: Authentication with APi Token...");
    }

    @Override
    public void processPayment(double amount){
     connectToAPI();
        System.out.println("paypal:Executing wallet Transfer of $" + amount);
        logTransaction("PAYPAL", amount);
    }
}
