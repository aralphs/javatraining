package com.anthony;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount account = new BankAccount(12345678, 100.03, "Mr John Smith", "jsmith@test.com", "01159213123");

//        account.setAccountNumber(12345678);
//        account.setBalance(100.03);
//        account.setName("Mr John Smith");
//        account.setEmail("jsmith@test.com");
//        account.setPhoneNumber("01159213123");

        System.out.println("Account Number is " + account.getAccountNumber());
        System.out.println("Account Balance is " + account.getBalance());
        System.out.println("Account Name is " + account.getName());
        System.out.println("Account Email is " + account.getEmail());
        System.out.println("Account Phone Number is " + account.getPhoneNumber());

        account.deposit(100.02);
        System.out.println("Account Balance is " + account.getBalance());

        String response = account.withdrawal(100.03);
        System.out.println(response);

        response = account.withdrawal(100.03);
        System.out.println(response);

        BankAccount antsAccount = new BankAccount("Ant", "ant@test.com", "1234534");
        System.out.println(antsAccount.getAccountNumber() + " name " + antsAccount.getName());

        VipCustomer vip1 = new VipCustomer("Fred", 200.00, "fred@test.com");
        System.out.println("VIP Name: " + vip1.getName() + ", Credit Limit: " + vip1.getCreditLimit() + ", email: " + vip1.getEmail());

        VipCustomer vip2 = new VipCustomer();
        System.out.println("VIP Name: " + vip2.getName() + ", Credit Limit: " + vip2.getCreditLimit() + ", email: " + vip2.getEmail());

        VipCustomer vip3 = new VipCustomer("bob@test.com");
        System.out.println("VIP Name: " + vip3.getName() + ", Credit Limit: " + vip3.getCreditLimit() + ", email: " + vip3.getEmail());


    }
}
