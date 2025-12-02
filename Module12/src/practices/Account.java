package practices;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private int id;
    private String name;
    private double balance;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0.0;
    }

    public Account(int id, String name, double balance) {
        this(id, name);
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Balance: " + balance;
    }

    // 加入throws IllegalArgumentException宣告
    public void deposite(double amount) throws IllegalArgumentException{
        if (amount > 0) {
            balance += amount;
        }
        else {
            // 建立並產生IllegalArgumentException
            throw new IllegalArgumentException("存款金額必須大於0，但你給的是: " + amount);
        }
    }

    // 加入throws IllegalArgumentException, OverdraftException宣告
    public void withdraw(double amount) throws IllegalArgumentException, OverdraftException{
        if (amount <= 0) {
            // 建立並產生IllegalArgumentException
            throw new IllegalArgumentException("存款金額必須大於0，但你給的是: " + amount);
        }

        if (balance < amount) {
            // 建立並產生OverdraftException
            throw new OverdraftException(
                    "餘額不足，無法提款。 餘額: " + balance + "，提款金額: " + amount
            );
        }

        balance -= amount;
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

    public void setBalance(BigDecimal balance) {
        this.balance = balance.doubleValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return id == account.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
