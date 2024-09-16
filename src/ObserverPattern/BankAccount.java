package ObserverPattern;

public class BankAccount{
    private String owner;
    private Double balance;

    public BankAccount(String owner){
        this.owner = owner;
        this.balance = 0.0;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Owner: " + this.owner + ", " + "Balance: " + this.balance;
    }
}
