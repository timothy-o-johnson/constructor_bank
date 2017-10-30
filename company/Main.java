package com.company;

public class Main {

    public static void main(String[] args) {
      /*  BankAccount newAccount = new BankAccount();

        System.out.println(newAccount.getBalance());
        newAccount.depositFunds(12);
        newAccount.depositFunds(12);
        newAccount.depositFunds(-30);
        newAccount.withdrawFunds(30);
        newAccount.withdrawFunds(10);*/

        VipCustomer vipTim = new VipCustomer();
        vipTim.getCreditLimit();
        vipTim.getEmail();
        vipTim.getName();

        System.out.println("*********");

        VipCustomer vipTim1 = new VipCustomer("Tim",2_000);
        vipTim1.getCreditLimit();
        vipTim1.getEmail();
        vipTim1.getName();
        System.out.println("*********");

        VipCustomer vipTim2 = new VipCustomer("Jim",1_000, "pavementii@gmail.com");
        vipTim2.getCreditLimit();
        vipTim2.getEmail();
        vipTim2.getName();
    }
}
