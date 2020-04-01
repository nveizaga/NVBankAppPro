package bank;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Account {
    private String name;
    private String account;
    private double balance;
    private ArrayList transactions;
    private ArrayList deposits;
    private ArrayList withdraw;

    public  Account(String name,String account){
        setName(name);
        setAccount(account);
        this.withdraw = new ArrayList();
        this.deposits = new ArrayList();
        this.transactions = new ArrayList();

    }
    public void setName(String name){
        this.name = name;
    }
    public void setAccount(String account){
        this.account = account;
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }
    public String getName(){
        return  name;
    }
    public String getAccount(){
        return  account;
    }
    public Double getBalance(){
        return balance;
    }
    public void setInitialBalance(double balance){
        this.balance = balance;
    }
    public void myBalance(){
        System.out.println("My Balance :" + balance);
    }
    public  void addDeposit(double amount){
        deposits.add(amount);
    }
    public  void addTransaction(double amount){
        transactions.add(amount);
    }
    public void addWithdraw(double amount){
        withdraw.add(amount);
    }

}



