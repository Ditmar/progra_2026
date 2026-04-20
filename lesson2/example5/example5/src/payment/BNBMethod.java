package payment;

import payment.utils.ProcessBalance;

public class BNBMethod extends QrMethod{
    @Override
    public boolean deposit(Double currency) {
        System.out.println("Init Payment method using QR BNB");
        System.out.println("Processing payment");
        Double newBalance = ProcessBalance.processTransaction(this.getBalance(), currency);
        this.setBalance(newBalance);
        System.out.println("Successfully");
        return true;
    }
    public void showBalance() {
        System.out.println("Your balance is " + this.getBalance() + " BNB ACTION");
    }
}
