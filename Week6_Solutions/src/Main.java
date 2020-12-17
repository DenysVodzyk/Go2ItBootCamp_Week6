public class Main {
    public static void main(String[] args) {
        Account account1 = new SavingAccount(111, "Elon Musk", 1000000, 1000);
        Account account2 = new SavingAccount(222, "Warren Buffett", 2000000, 2000);
        Account account3 = new SavingAccount(222, "Elon Musk", 1000000, 1000);

        account1.deposit(200);
        System.out.println(account1.getBalance());
        account1.deposit(-2000);
        System.out.println(account1.getBalance());

        account1.withdraw(200);

        System.out.println(account1.getBalance());
        account1.withdraw(999995);
        System.out.println(account1.getBalance());
        account1.withdraw(3);
        System.out.println(account1.getBalance());


        AccountManager accountManager = new AccountManager();
        accountManager.addAccount(account1);
        accountManager.addAccount(account2);
        accountManager.addAccount(account3);

        System.out.println(accountManager);
        System.out.println(accountManager.listAllAccounts());
        System.out.println("Account Details: " + accountManager.printAccountDetails(111));

    }
}
