package org.example;

import java.util.ArrayList;
import java.util.List;

public class PaymentSystem {
    public static void main(String[] args) {
       IPaymentProcessor pro=new PaypalProcessor();
        try{
            pro.processPayment(50);
        }catch (PaymentException e){
            //handle the error
            System.err.println("Payment failed"+ e.getMessage());
        }finally {
            System.out.println("closing payment gateway connection");
        }
        // We use the INTERFACE as the type (Abstraction)
        // This hides whether it's Stripe or PayPal from the main logic.
//        List<IPaymentProcessor> processorr = new ArrayList<>();
//        processorr.add(new StripeProcessor());
//        processorr.add(new PaypalProcessor());
//        processorr.add(new CryptoProcessor());
        System.out.println("---starting batch processor----");
//        for(IPaymentProcessor p :processorr){
//            p.processPayment(300);
//            System.out.println("-----------------------");
//        }
//        IPaymentProcessor processor;

//        System.out.println("--- Testing Stripe ---");
//        processor = new StripeProcessor();
//        processor.processPayment(250.0);
//
//        System.out.println("\n--- Testing PayPal ---");
//        processor = new PaypalProcessor();
//        processor.processPayment(500.0);
//
//        System.out.println("\n--- Testing Cryto ---");
//        processor = new CryptoProcessor();
//        processor.processPayment(100);

}}
