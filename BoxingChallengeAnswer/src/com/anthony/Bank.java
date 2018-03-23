package com.anthony;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public Boolean addBranch(String branchName){
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            System.out.println("Branch " + branchName + " has been added");
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println(customerName + " added");

            return branch.newCustomer(customerName, initialAmount);
        }
        System.out.println("Unable to add " + customerName);
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
//        System.out.println("Finding branch - " + branch.getName());
        if(branch != null){
            System.out.println("Adding " + amount + " for " + customerName);
            return branch.addNewTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for(int i=0; i<this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
//            System.out.println("Finding " + branchName);
            if(checkedBranch.getName().equals(branchName)) {
//                System.out.println("Found " + checkedBranch.getName());
                return checkedBranch;
            }
//            System.out.println("Unable to find " + branchName);
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customers details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0; i<branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if (showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0; j<transactions.size(); j++){
                        System.out.println("[" + (j+1) + "] Amount -- " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
 }
