import app.PaymentProcess;
import payment.*;
public class App {
    public static void main(String[] args) throws Exception {
        //Providers
        BNBMethod bnb = new BNBMethod();
        UnionMethod union = new UnionMethod();
        DebitCard debit = new DebitCard();
        Crypto crypto = new Crypto();
        //execute
        PaymentProcess payment = new PaymentProcess((PaymentMethod)bnb);
        payment.deposit(300.00);
    }
}
