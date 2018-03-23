package com.anthony;

import java.util.Scanner;

public class Main {

    private static Bank bank = new Bank("HSBC");

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        System.out.println("Welcome to " + bank.getName() );
        printActions();
        while(!quit) {
            System.out.println("Enter your action: (6 to show available actions)");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("\nQuitting...");
                    quit=true;
                    break;
                case 1:
                    bank.setBranches();
                    break;
//                case 2:
//                    addContact();
//                    break;
//                case 3:
//                    updateContact();
//                    break;
//                case 4:
//                    removeContact();
//                    break;
//                case 5:
//                    searchForContact();
//                    break;
                case 6:
                    printActions();
                    break;
            }
        }











        //Quit
    }

    //Add a branch
//    private static void addBranch() {
//        System.out.println("Enter new branch name");
//        String branchName = scanner.nextLine();
//
////        Contacts newContact = Contacts.addContact(name, phoneNumber);
////        if(mobilePhone.addNewContact(newContact)){
////            System.out.println("New contact added: name = " + name + ", phone = " + phoneNumber);
////        } else {
////            System.out.println("Cannot add, " + name + " already on file");
////        }
//    }

    //List branches

    //Add a Customer

    //Display Customers at a branch

    //Add a transaction for a Customer

    //Display transactions for a Customer

    //Display List of options
    private static void printActions(){
        System.out.println("\nAvailable actions: \n press");
        System.out.println("\t 0 - To quit.");
        System.out.println("\t 1 - To Add a Branch");
        System.out.println("\t 2 - To List Branches");
        System.out.println("\t 3 - To Add a Customer to a branch");
        System.out.println("\t 4 - To List Customers of a branch");
        System.out.println("\t 5 - To Add a transaction to a Customers Account");
        System.out.println("\t 5 - To search for a Customers");
        System.out.println("\t 6 - To print a list of available actions." );
        System.out.println("\n");
    }


}
