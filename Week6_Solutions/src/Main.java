public class Main {
    public static void main(String[] args) {
        Account account1 = new SavingAccount(111, "Elon Musk", 1000000, 1000);

        account1.deposit(200);
        System.out.println(account1.getBalance());
        account1.deposit(-2000);
        System.out.println(account1.getBalance());

        account1.withdraw(200);
        System.out.println(account1.getBalance());
        account1.withdraw(1000000);
        System.out.println(account1.getBalance());

//
//        AccountManager accountManager = new AccountManager();
//        accountManager.addAccount(111, "Elon Musk", 1000000, 1000);
//        accountManager.addAccount(222, "Warren Buffett", 2000000, 2000);
//
//
//        System.out.println(accountManager.printAccountDetails(111));
//        System.out.println(accountManager);


    }
}
