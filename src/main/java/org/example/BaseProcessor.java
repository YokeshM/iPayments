package org.example;
// 2. THE ABSTRACT CLASS (The Template)
// Hides common logic like "logging" so we don't repeat code.
public abstract class BaseProcessor {
    // 1. Private fields: No one outside this class can see these
    private String transactionStatus="pending";
    private double vaultBalance=10000.0;

    // 2. Getter: Allow people to READ the status, but not change it directly
    public String getTransactionStatus(){
        return transactionStatus;
    }

    // 3. Setter with Logic: The "Security Checkpoint"
    public void setTransactionStatus(String status) {
        if (status.equals("success") || status.equals("Failed")){
            this.transactionStatus = status;
    }else{System.out.println("ALERT: Invalid status attempt!");

    }}

    // Concrete method: Every processor uses this same code
    void logTransaction(String provider, double amount){
        System.out.println("[Log]: "+provider+"processed transaction of $"+ amount);
    }
    // Abstract method: Forces subclasses to define their own specific connection logic
    abstract void connectToAPI();
}
