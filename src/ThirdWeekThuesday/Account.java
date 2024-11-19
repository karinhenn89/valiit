package ThirdWeekThuesday;

import java.util.ArrayList;
import java.util.List;


public class Account {


    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    String username;
    double balance;
    int PIN;

    public Account(String username, double balance, int PIN) {
        this.username = username;
        this.balance = balance;
        this.PIN = PIN;
    }


    public List<Account> getAccounts() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Liis", 1000, 1111));
        accounts.add(new Account("Mari", 2000, 2222));

        return accounts;
    }

}



