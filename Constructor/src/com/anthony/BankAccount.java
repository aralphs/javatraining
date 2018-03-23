package com.anthony;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(1212124, 2.50, "Default Name", "Default email", "Default phone number");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int number, double balance, String name, String email, String phoneNumber){

        this.accountNumber = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public BankAccount(String name, String email, String phoneNumber) {
        this(11112222, 100.55, name, email, phoneNumber);
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(double deposit){
        this.balance += deposit;
        System.out.println("Deposit of " + deposit + ", balance is now " + this.balance);
    }

    public String withdrawal(double amount){
        if (amount <= this.balance){
            this.balance -= amount;
            String response = "Amount " + amount + " withdrawn from account, balance now is " + this.balance;
            return response;
        } else {
            return "Insufficient funds in the account";
        }
    }
}
