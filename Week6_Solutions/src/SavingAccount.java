public class SavingAccount extends Account {
    private double minimumBalance;

    public SavingAccount() {
    }

    public SavingAccount(int accNumber, String owner, double balance, double minimumBalance) {
        super(accNumber, owner, balance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public boolean withdraw(double amount) {
        double remainingBalance = super.getBalance() - amount;
        double fee = 1.5;
        if (amount <= (super.getBalance() - fee)) {
            if (amount > (getBalance() - getMinimumBalance())) {
                System.out.println("Extra charge of $1.5 will be applied to your account.");
                super.setBalance(remainingBalance - fee);
            } else {
                super.setBalance(remainingBalance);
            }
            return true;
        }
        System.out.println("You don't have enough money on your saving account.");
        return false;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    @Override
    public String toString() {
        return "SavingAccount{" + super.toString() + ", " +
                "minimumBalance=" + minimumBalance +
                '}';
    }
}

