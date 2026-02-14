package org.example;

public class PaypalProcessor extends BaseProcessor implements IPaymentProcessor{
    @Override
    public void connectToAPI(){
        System.out.println("Paypal: Authentication with APi Token...");
    }

    @Override
    public void processPayment(double amount) throws PaymentException{
        if (amount<=0){
            throw new PaymentException("Invalid amount"+ amount);
        }
        boolean isApiDown=true;
        if (isApiDown){
            throw new PaymentException("paypal APi is currently down");
        }
        System.out.println("Processing paypal payment");
     connectToAPI();
        System.out.println("paypal:Executing wallet Transfer of $" + amount);
        logTransaction("PAYPAL", amount);
    }
}
