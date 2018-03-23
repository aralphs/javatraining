package com.anthony;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static MobilePhone mobilePhone = new MobilePhone("008934345346");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        int choice = 0;
        printActions();
        while(!quit) {
            System.out.println("Enter your action: (6 to show available actions)");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit=true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone");
    }

    private static void addContact() {
        System.out.println("Enter new contact name");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = scanner.nextLine();
        Contacts newContact = Contacts.addContact(name, phoneNumber);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: name = " + name + ", phone = " + phoneNumber);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter new contact name");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.addContact(newName, newNumber);

        if(mobilePhone.updateContact(existingContact, newContact)){
            System.out.println("Successfully updated the record");
        } else {
            System.out.println("Unable to update record");
        }
    }

    private static void removeContact(){
        System.out.println("Enter contact name to be removed");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContact)){
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void searchForContact(){
        System.out.println("Enter contact name to be searched for");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Contact name: " + existingContact.getName() + ", phone number: " + existingContact.getPhoneNumber() + " found");
    }

    private static void printActions (){
        System.out.println("\nAvailable actions: \n press");
        System.out.println("\t 0 - To shutdown.");
        System.out.println("\t 1 - To print contacts");
        System.out.println("\t 2 - To add a new contact.");
        System.out.println("\t 3 - To update an existing contact.");
        System.out.println("\t 4 - To remove an existing contact.");
        System.out.println("\t 5 - To search for a contact.");
        System.out.println("\t 6 - To print a list of available actions.");
//        System.out.println("Choose your action: ");
    }
}
