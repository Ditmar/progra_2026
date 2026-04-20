import bank.LimitAccount;

public class App {
    public static void main(String[] args) throws Exception {
        LimitAccount limitAccount = new LimitAccount(100.0);
        limitAccount.addBalance(500.00);
        limitAccount.addBalance(700.00);
        limitAccount.showBalance();
        limitAccount.withdraw(1000.0);
        limitAccount.showBalance();
    }
}
