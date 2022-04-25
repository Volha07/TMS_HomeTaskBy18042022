package HomeTaskBy25042022;

public class CreditCard {

    private int account;
    private double amount;

    public void addAmount(double i){
        this.amount = amount + i;
    }

    public void chargeAmount(double j){
        this.amount = amount - j;
    }

    public int getAccount() {
        return this.account;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
