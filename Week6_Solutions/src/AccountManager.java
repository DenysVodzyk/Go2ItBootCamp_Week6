import java.util.Arrays;

public class AccountManager {
    private Account[] accounts;
    private int numAccounts;
    private int maxAccounts;

    public AccountManager() {
        this.maxAccounts = 100;
        this.numAccounts = 0;
        this.accounts = new Account[this.maxAccounts];
    }

    public void addAccount(Account account) {
        if (!isAccountInTheList(account.getAccNumber())) {
            if (numAccounts < maxAccounts) {
                accounts[numAccounts] = account;
                numAccounts++;
            } else {
                System.out.println("Number of accounts is exceeded.");
            }
        } else {
            System.out.println("Account " + account.getAccNumber() + " is already in the list.");
        }
    }

    public boolean isAccountInTheList(int accNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccNumber() == accNumber) {
                return true;
            }
        }
        return false;
    }

    public String printAccountDetails(int accNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccNumber() == accNumber) {
                return accounts[i].toString();
            }
        }
        return "No such account found";
    }

    public String listAllAccounts() {
        return Arrays.toString(accounts);
    }

    @Override
    public String toString() {
        return "AccountManager{" +
                "accountList=" + listAllAccounts() +
                ", numAccounts=" + numAccounts +
                ", maxAccounts=" + maxAccounts +
                '}';
    }
}
