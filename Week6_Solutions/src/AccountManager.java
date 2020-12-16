import java.util.Arrays;

public class AccountManager {
    private Account[] accountList;
    private int numAccounts;
    private int maxAccounts;

    public AccountManager() {
        this.maxAccounts = 100;
        this.numAccounts = 0;
        this.accountList = new Account[this.maxAccounts];
    }

    public void addAccount(int accNumber, String owner, double balance, double minimumBalance) {
        Account account = new SavingAccount(accNumber, owner, balance, minimumBalance);

        if (numAccounts < maxAccounts) {
            accountList[numAccounts] = account;
            numAccounts++;
        } else {
            System.out.println("Number of accounts is exceeded.");
        }
    }

    public int accNum() {
        return accountList[0].getAccNumber();
    }

    public String printAccountDetails(int accNumber) {
        String accDetails = "No such account found";
        for (int i = 0; i < numAccounts; i++) {
            if (accountList[i].getAccNumber() == accNumber) {
                accDetails = accountList[i].toString();
            }
        }
        return accDetails;
    }

    public String listAllAccounts() {
        return Arrays.toString(accountList);
    }

    @Override
    public String toString() {
        return "AccountManager{" +
                "accountList=" + Arrays.toString(accountList) +
                ", numAccounts=" + numAccounts +
                ", maxAccounts=" + maxAccounts +
                '}';
    }
}

//
//        for (Account account : accountList) {
//                if (account.getAccNumber() == accNumber) {
//                accDetails = account.toString();
//                } else {
//                accDetails = "No such account found";
//                }
//                }