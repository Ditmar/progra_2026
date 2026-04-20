package app;
import payment.PaymentMethod;
public class PaymentProcess {
    private PaymentMethod method;
    public PaymentProcess(PaymentMethod method) {
        this.method = method;
    }
    public void deposit(Double currency) {
        method.deposit(currency);
        method.showBalance();
    }
    
}
