public class Main {
    public static void main(String[] args) {
        Account account1 = new SavingAccount(111, "Elon Musk", 1000000, 1000);

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
        accountManager.addAccount(111, "Elon Musk", 1000000, 1000);
        accountManager.addAccount(222, "Warren Buffett", 2000000, 2000);
        accountManager.addAccount(222, "Elon Musk", 1000000, 1000);

        System.out.println(accountManager);
        System.out.println(accountManager.listAllAccounts());
        System.out.println("Account Details: " + accountManager.printAccountDetails(111));


    }
}
