//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;

    Deposit(double amount, Date date, String account) {
        this.amount = amount;
        this.account = account;
        this.date = date;
    }

    public String toString() {
        double var10000 = this.amount;
        return "Deposit of: $" + var10000 + " Date: " + this.date.toString() + " into account: " + this.account;
    }
}
