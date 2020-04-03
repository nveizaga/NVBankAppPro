import bank.Account;
import bank.BankAppRun;

public class Main {
    public static void main(String[] args) {

        // User details
        Account accountOne = new Account("Jerry","BO10006789");
        accountOne.setInitialBalance(5000);

        // Run BankApp
        BankAppRun bankAppRun = new BankAppRun(accountOne);
        bankAppRun.run();

    }

}
