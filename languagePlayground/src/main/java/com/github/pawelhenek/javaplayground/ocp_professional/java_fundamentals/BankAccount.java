package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

interface Account {
    public default String getId() {
        return "0000";
    }
}

interface PremiumAccount extends Account {
    public String getId();
}

public class BankAccount implements PremiumAccount {

    // without the method below it doesnot compile
    @Override
    public String getId() {
        return null;
    }

    public static void main(String[] args) {
        Account acct = new BankAccount();
        System.out.println(acct.getId());
    }

}