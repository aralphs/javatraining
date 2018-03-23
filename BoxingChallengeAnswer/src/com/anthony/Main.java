package com.anthony;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("HSBC");

        bank.addBranch("Beeston");
        bank.addBranch("Chilwell");

        Boolean output = bank.addCustomer("Beeston", "Ant", 50.05 );
        System.out.println(output);
        output = bank.addCustomer("Beeston", "Dave", 175.34);
        System.out.println(output);
        output = bank.addCustomer("Beeston", "Percy", 220.12);
        System.out.println(output);

//        bank.addBranch("Nottingham");

        output = bank.addCustomer("Chilwell", "Bob", 150.54);
        System.out.println(output);
        output = bank.addCustomer("Chilwell", "Mike", 30.54);
        System.out.println(output);
//        bank.addCustomer("Chilwell", "Bob", 100.00);

        bank.addCustomerTransaction("Beeston", "Ant", 44.22);
        bank.addCustomerTransaction("Beeston", "Ant", 12.44);
        bank.addCustomerTransaction("Beeston", "Dave", 1.64);
        bank.addCustomerTransaction("Beeston", "Percy", 10.64);
        bank.addCustomerTransaction("Beeston", "Percy", 12.00);
        bank.addCustomerTransaction("Chilwell", "Bob", 100.00);
        bank.addCustomerTransaction("Chilwell", "Bob", 100.00);
        bank.addCustomerTransaction("Chilwell", "Bob", 100.00);
        bank.addCustomerTransaction("Chilwell", "Bob", 100.00);
        output = bank.addCustomerTransaction("Chilwell", "Bob", 100.00);
        System.out.println(output);
        output = bank.addCustomerTransaction("Chilwell", "Mike", 100.00);
        System.out.println(output);

//        bank.listCustomers("Beeston", false);

        bank.listCustomers("Beeston", true);

        bank.listCustomers("Chilwell", true);

//        bank.displayCustomer("Beeston", "Mike", true);
    }
}
