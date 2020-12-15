public abstract class Account {
    private int accNumber;
    private double balance;
    private String owner;

    public Account() {
    }

    public Account(int accNumber, String owner, double balance) {
        this.accNumber = accNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public abstract boolean withdraw(double amount);

    public boolean deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNumber=" + accNumber +
                ", balance=" + balance +
                ", owner='" + owner + '\'' +
                '}';
    }
}
