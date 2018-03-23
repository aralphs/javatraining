package com.anthony;

import java.util.ArrayList;

public class Branches {

    private String branchName;
    ArrayList<Customer> customer = new ArrayList<Customer>();


    public Branches(String branchName, ArrayList<Customer> customer) {
        this.branchName = branchName;
        this.customer = customer;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setCustomer(ArrayList<Customer> customer) {
        this.customer = customer;
    }
}
