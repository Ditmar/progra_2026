package payment;

public abstract class PaymentMethod {
    private Double balance;
    public PaymentMethod() {
        this.balance = 0.0;
    }
    public Double getBalance() {
        return this.balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    public void showBalance() {
        System.out.println("Your balance is " + this.getBalance());
    }
    public abstract boolean deposit(Double currency);
}
