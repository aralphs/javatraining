package com.anthony;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("HSBC");

        if(bank.addBranch("Beeston")) {
            System.out.println("Beeston branch created");
        }

        bank.addCustomer("Beeston", "Tim", 50.05);
        bank.addCustomer("Beeston", "Mike", 175.34);
        bank.addCustomer("Beeston", "Percy", 220.12);

        bank.addBranch("Chilwell");
        bank.addCustomer("Chilwell", "Bob", 150.54);

        bank.addCustomerTransaction("Beeston", "Tim", 44.22);
        bank.addCustomerTransaction("Beeston", "Tim", 12.44);
        bank.addCustomerTransaction("Beeston", "Mike", 1.65);

        bank.listCustomers("Beeston", true);
        bank.listCustomers("Chilwell", true);

        bank.addBranch("Nottingham");

        if(!bank.addCustomer("Nottingham", "Brian", 5.53)) {
            System.out.println("Error Nottingham branch does not exist");
        }

        if(!bank.addBranch("Beeston")) {
            System.out.println("Beeston branch already exists");
        }

        if(!bank.addCustomerTransaction("Beeston", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Beeston", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }
    }
}
