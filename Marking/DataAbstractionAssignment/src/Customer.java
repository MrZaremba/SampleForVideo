//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer() {
    }

    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;
    }

    public double deposit(double amt, Date date, String account) {
        new Deposit(amt, new Date(), "Saving");
        return 0.0D;
    }

    public double withdraw(double amt, Date date, String account) {
        if (this.checkOverdraft(amt, account)) {
            Withdraw withdraw = new Withdraw(amt, date, account);
            this.withdraws.add(withdraw);
        }

        return 0.0D;
    }

    private boolean checkOverdraft(double amt, String account) {
        if (account == "Checking") {
            return amt <= this.checkBalance;
        } else if (account == "Saving") {
            return amt <= this.savingBalance;
        } else {
            System.out.println("Error");
            return false;
        }
    }

    public void displayDeposits() {
        Iterator var1 = this.deposits.iterator();

        while(var1.hasNext()) {
            Deposit d = (Deposit)var1.next();
            System.out.println(d);
        }

    }

    public void displayWithdraws() {
        Iterator var1 = this.withdraws.iterator();

        while(var1.hasNext()) {
            Withdraw w = (Withdraw)var1.next();
            System.out.println(w);
        }

    }
}
