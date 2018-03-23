package com.anthony;

import java.util.ArrayList;

public class Customer {

    private String name;
    ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }
}
