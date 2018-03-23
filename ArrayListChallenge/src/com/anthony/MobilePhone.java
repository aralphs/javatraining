package com.anthony;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> myContacts = new ArrayList<Contacts>();

    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myContacts = new ArrayList<Contacts>();
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contacts contacts) {
        if(findContact(contacts.getName()) >=0 ){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contacts);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition <0){
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contacts contacts){
        int foundPosition = findContact(contacts);
        if(foundPosition <0){
            System.out.println(contacts.getName() + ", was not found.");
            return false;
        }

        this.myContacts.remove(foundPosition);
        System.out.println(contacts.getName() + ", was removed");
        return true;
    }

    private int findContact(Contacts contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i=0; i<this.myContacts.size(); i++){
            Contacts contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contacts contact) {
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact(String name){
        int position = findContact(name);
        if(position >=0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List");
        for(int i=0; i<this.myContacts.size(); i++){
            System.out.println((i+1) + "." + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }

    //
//    public void addContact(String name, int phoneNumber){
//
//        contacts.add()
//        contacts.addContact(name, phoneNumber);
//
//    }
//
//    public void printContactsList(){
//        System.out.println(Contacts);
//    }


}
