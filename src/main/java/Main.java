import bank.BankApp;
import bank.Account;

public class Main {
    public static void main(String[] args) {

        // User details
        Account accountOne = new Account("Jerry","BO10006789");
        accountOne.setInitialBalance(5000);

        // Welcome to the BankApp
        BankApp bankApp = new BankApp(accountOne);
        bankApp.runBankApp();

        // Main Menu
        bankApp.menu();

        // Press a key to select an option
        bankApp.pressKey();

    }

}
