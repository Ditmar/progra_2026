package payment;

public class QrMethod extends PaymentMethod {

    @Override
    public boolean deposit(Double currency) {
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }
    
}
