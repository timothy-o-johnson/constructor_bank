package com.company;

public class BankAccount {

    private int accountNumber;
    private double balance = 5;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void depositFunds (double deposit) {
        if (deposit > 0) {
            this.balance += deposit;
            System.out.println("New balance is $" + this.balance + ".");
        } else {
            System.out.println("Sorry deposit has to be greater than 0.");
        }
    }

    public void withdrawFunds (double withdrawal){
        if(withdrawal <= this.balance){
            this.balance -= withdrawal;
            System.out.println("New balance is " + this.balance + ".");
        } else {
            System.out.println("Cannot make withdrawal. Balance too low.");
        }
    }
}
