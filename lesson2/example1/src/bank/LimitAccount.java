package bank;

public class LimitAccount extends Account{
    private Double limit;
    public LimitAccount(Double balance) {
        super(balance);
        refreshLimit();
    }
    public void refreshLimit() {
        this.limit = this.getBalance() / 2;
    }
    public void showLimit() {
        System.out.println("The limit is : " + this.limit);
    }
}
