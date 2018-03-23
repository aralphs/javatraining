package com.anthony;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }

        return false;
    }

    public boolean addNewTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
//        System.out.println("Finding Customer " + existingCustomer.getName());
        if(existingCustomer != null){
            System.out.println("In Branch Class - Adding instruction for " + customerName);
            existingCustomer.addTransaction(amount);
            return true;
        }
        System.out.println("In Branch Class add new transaction false");
        return false;
    }

    private Customer findCustomer(String customerName) {
        for(int i=0; i<this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
            return null;
        }
        return null;
    }



}
