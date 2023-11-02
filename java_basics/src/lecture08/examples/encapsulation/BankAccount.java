package lecture08.examples.encapsulation;

import java.util.*;

public class BankAccount {
    private String ownerName;
    private double accountBalance = 0;
    private String accountNumber;

    BankAccount(String name) {
        this.ownerName = name;
        name = name.replace(" ", "");
        setAccountNumber(name);
    }

    BankAccount(String name, double transaction) {
        this(name);
        this.accountBalance = this.accountBalance + transaction;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (this.ownerName == null)
            this.ownerName = ownerName;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void makeTransaction(double transaction) {
        this.accountBalance = this.accountBalance + transaction;
    }
    private void setAccountNumber(String name) {
        Date d = new Date();
        Random r = new Random();
        this.accountNumber = name + "_" + d.getTime() + "_" + r.nextInt();
    }
}

