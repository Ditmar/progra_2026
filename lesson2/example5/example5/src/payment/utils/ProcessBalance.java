package payment.utils;

public class ProcessBalance {
    public static Double processTransaction(Double currentBalance, Double currency) {
        Double newBalance = currentBalance + currency;
        return newBalance;
    }
}
