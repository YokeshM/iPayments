package org.example;

public class CryptoProcessor extends BaseProcessor implements IPaymentProcessor{
    @Override
    public void connectToAPI(){
        System.out.println("Crypto: Authentication with API token ");
    }

    @Override
    public void processPayment(double amount){
        connectToAPI();
        System.out.println("Crypto:connecting to cryto currency"+ amount);
        logTransaction("Crypto", amount);
    }
}
