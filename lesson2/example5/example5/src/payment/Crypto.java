package payment;

import payment.utils.ProcessBalance;

public class Crypto extends PaymentMethod {

    @Override
    public boolean deposit(Double currency) {
        System.out.println("Init Payment method using Crypto");
        System.out.println("Processing payment");
        Double newBalance = ProcessBalance.processTransaction(this.getBalance(), currency);
        this.setBalance(newBalance);
        System.out.println("Successfully"); 
        return true;
    }

    @Override
    public void showBalance() {
        System.out.println("Your balance is " + this.getBalance());
    }
    
}
