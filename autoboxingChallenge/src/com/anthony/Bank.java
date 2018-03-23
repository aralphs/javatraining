package com.anthony;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private String name;

    private static Scanner scanner = new Scanner(System.in);

    ArrayList<Branches> branches = new ArrayList<Branches>();

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBranches() {
        System.out.println("Enter new branch name");
        String branchName = scanner.nextLine();
        branches(branchName);

//        Contacts newContact = Contacts.addContact(name, phoneNumber);
//        this.branches = branches;
    }

    public ArrayList<Branches> getBranches() {
        return branches;
    }
}
