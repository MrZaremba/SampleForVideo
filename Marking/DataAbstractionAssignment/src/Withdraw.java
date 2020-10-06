//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account) {
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public String toString() {
        double var10000 = this.amount;
        return "Withdrawal of: $" + var10000 + " Date: " + this.date.toString() + " from account: " + this.account;
    }
}
