package bank;
import java.util.Scanner;
import static java.lang.System.lineSeparator;
import static java.lang.System.out;

public class BankAppRun {
    private Account account;
    private BankApp  bankApp;

    public BankAppRun(Account account){
        this.account = account;
        bankApp = new BankApp(account);
    }

    public void print(String stringToPrint){
        out.println(stringToPrint);
    }
    public void run() {
        login();
        showMainMenu();
        selectOptionMenuBank();

    }
    public void showMainMenu(){
        print(lineSeparator());
        print("********************");
        String[] options = {"(W) Withdraw", "(D) Deposit", "(B) My Balance", "(T) My Transactions", "(E) Exit" };
        for(String option : options) {
            print(option);
        }
        print("********************");
    }
    public void login(){
        out.println("Welcome " + account.getName());
        out.println("Your current account is " + account.getAccount());
    }
    public void selectOptionMenuBank() {
        // Press a key to select an option
        try (Scanner scanner = new Scanner(System.in)){
            boolean closeApp = false;
            char option;
            while (true) {
                print("Select an option: ");
                option = (char) scanner.next().trim().toUpperCase().charAt(0);
                switch (option) {
                    case 'A':
                        showMainMenu();
                        break;
                    case 'W':
                        showWithdrawMenu();
                        selectOptionMenuWithdraw(scanner);
                        break;
                    case 'D':
                        print("Insert Deposit amount:");
                        double depAmount = (double) scanner.nextDouble();
                        bankApp.deposit(depAmount);
                        break;
                    case 'B':
                        account.myBalance();
                        break;
                    case 'T':
                        print("Insert Transaction amount:");
                        double transAmount = (double) scanner.nextDouble();
                        bankApp.transaction(transAmount);
                        break;
                    case 'E':
                        print("Exit...");
                        break;
                    default:
                        print(option + " is an invalid option");
                        break;
                }

                // Is running
                if (closeApp) {
                    break;
                }

                print("(A) Show All options");
            }


        }

    }
    public void showWithdrawMenu(){
        print(lineSeparator());
        print("Select an option: ");
        print("********************");
        String[] options = {"(A) 10 $", "(B) 20 $", "(C) 50 $", "(D) 100 $", "(E) 200 $", "(F) Other" };
        for(String option : options) {
            print(option);
        }
        print("********************");
    }
    public void selectOptionMenuWithdraw(Scanner scanner) {
        // Press a key to select an option
        Boolean givenAmount = true;
        char option = (char) scanner.next().trim().toUpperCase().charAt(0);
        while (givenAmount) {
            switch (option) {
                case 'A':
                    bankApp.withdraw(10);
                    givenAmount=false;
                    break;
                case 'B':
                     bankApp.withdraw(20);
                     givenAmount=false;
                     break;
                case 'C':
                     bankApp.withdraw(50);
                     givenAmount=false;
                     break;
                case 'D':
                     bankApp.withdraw(100);
                     givenAmount=false;
                     break;
                case 'E':
                      bankApp.withdraw(200);
                      givenAmount=false;
                      break;
                case 'F':
                      bankApp.withdraw(otherAmount(scanner));
                      givenAmount=false;
                      break;
                default:
                      print(option + " is an invalid option");
                      break;
                }
            }


    }

    public double otherAmount(Scanner scanner){
        print("Insert amount:");
        double amount = (double) scanner.nextDouble();
        return amount;

    }
}