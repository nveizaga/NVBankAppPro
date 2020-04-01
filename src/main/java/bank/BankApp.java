package bank;
import java.util.Scanner;
import static java.lang.System.lineSeparator;
import static java.lang.System.out;

public class BankApp {
    private Account account;

    public BankApp(Account account){
        this.account= account;
    }
    public void print(String stringToPrint){
        out.println(stringToPrint);
    }
    public void runBankApp(){
        print("Welcome " + account.getName());
        print("Your current account is " + account.getAccount());
    }
    private void withdraw(double amount){
        if(amount > 0){
            account.setBalance(account.getBalance() - amount);
            account.addWithdraw(amount);
        }else{
            System.out.println("Invalid value");
        }
    }

    private void deposit(double amount) {
        if(amount > 0){
            account.setBalance(account.getBalance() + amount);
            account.addDeposit(amount);
        }else{
            System.out.println("Invalid value");
        }

    }
    private void transaction(double amount) {
        if(amount > 0){
            account.setBalance(account.getBalance() - amount);
            account.addTransaction(amount);
        }else{
            System.out.println("Invalid value");
        }

    }

    public void menu(){
        print(lineSeparator());
        print("********************");
        String[] options = {"(W) Withdraw", "(D) Deposit", "(B) My Balance", "(T) My Transactions", "(E) Exit" };
        for(String option : options) {
            print(option);
        }
        print("********************");
    }

    public void pressKey() {
        try (Scanner scanner = new Scanner(System.in)) {
            char option;
            do {
                System.out.print("Select an option: ");
                option = (char) scanner.next().trim().toUpperCase().charAt(0);
                switch (option) {
                    case 'W':
                        print("Insert Withdraw amount:");
                        double withdrawAmount = (double) scanner.nextDouble();
                        withdraw(withdrawAmount);
                        break;
                    case 'D':
                        print("Insert Deposit amount:");
                        double depAmount = (double) scanner.nextDouble();
                        deposit(depAmount);
                        break;
                    case 'B':
                        account.myBalance();
                        break;
                    case 'T':
                        print("Insert Transaction amount:");
                        double transAmount = (double) scanner.nextDouble();
                        transaction(transAmount);
                        break;
                    case 'E':
                        print("Exit...");
                        break;
                    default:
                        print(option + " is an invalid option");
                        break;

                }
                print(lineSeparator());
                print("(A) Show All options");
                menu();
            } while (option != 'E');

        }

    }


}


