package practices;

import java.math.BigDecimal;

public class Account {
    private int id;
    private String name;
    private double balance;

    // 宣告constructor, 接收帳號,戶名兩個參數
    public Account(int id, String name){
        this.id = id;
        this.name = name;
    }
    // 宣告constructor, 接收帳號,戶名,餘額三個參數
    public Account(int id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    // deposite 存錢
    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    // withdraw 取錢
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }

    public String getInfo() {
        return "Id: " + id + "\n" +
                "Name: " + name + "\n" +
                "Balance: " + balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // 宣告設定餘額方法, 接收的餘額參數型態為BigDecimal
    public void setBalance(BigDecimal balance) {
        this.balance = balance.doubleValue();
    }
}
