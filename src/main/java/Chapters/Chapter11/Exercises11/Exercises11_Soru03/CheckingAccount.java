package Chapters.Chapter11.Exercises11.Exercises11_Soru03;

import Chapters.Chapter09.Exercises09.Exercises09_Soru07.Account;

public class CheckingAccount extends Account {
    private double limit;

    public CheckingAccount() {
        super();
        limit = -100;
    }

    public CheckingAccount(int id, double balance, double limit) {
        super(id, balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public void withDraw(double amount) {
        if (getBalance() - amount > limit) {
            setBalance(getBalance() - amount);
        } else
            System.out.println("you cannot take money poor guy your willings exceed limit !!!");

    }

    @Override
    public String toString() {
        return super.toString() + " the limit is " + limit + " $";
    }

}
