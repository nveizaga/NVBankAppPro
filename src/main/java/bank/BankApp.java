package bank;
import java.util.Scanner;

import static java.lang.System.lineSeparator;
import static java.lang.System.out;

public class BankApp {
    private Account account;

    public BankApp(Account account){
        this.account= account;
    }

    public void withdraw(double amount){
        if(amount > 0 && amount<=account.getBalance()){
            account.setBalance(account.getBalance() - amount);
            account.addWithdraw(amount);
        }else{
            out.println("Invalid value");
        }
    }

    public void deposit(double amount) {
        if(amount > 0){
            account.setBalance(account.getBalance() + amount);
            account.addDeposit(amount);
        }else{
            out.println("Invalid value");
        }

    }
    public void transaction(double amount) {
        if(amount > 0){
            account.setBalance(account.getBalance() - amount);
            account.addTransaction(amount);
        }else{
            out.println("Invalid value");
        }

    }

}


