package bank;

public class Account {
    private Double balance;
    public Account(Double balance) {
        this.balance = balance;
    }
    // addBalance agregar saldo
    public void addBalance(Double quantity) {
        this.balance += quantity;
    }
    //withdraw retirar saldo
    public void withdraw(Double quantity) {
        if (this.balance >= quantity) {
            this.balance -= quantity;
        }
    }
    // showBalance mostrar saldo
    public void showBalance() {
        System.out.println("The balance is: " + this.balance);
    }
    public Double getBalance() {
        return this.balance;
    }
}
