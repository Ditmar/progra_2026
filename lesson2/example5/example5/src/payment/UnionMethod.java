package payment;

import payment.utils.ProcessBalance;

public class UnionMethod extends QrMethod {
    @Override
    public boolean deposit(Double currency) {
        System.out.println("Init Payment method using QR UNION");
        System.out.println("Processing payment");
        Double newBalance = ProcessBalance.processTransaction(this.getBalance(), currency);
        this.setBalance(newBalance);
        System.out.println("Successfully");
        return true;
    }  
}
