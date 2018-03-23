package com.anthony;

public class Main {

    public static void main(String[] args) {

        Printer hp = new Printer(150, false);
        hp.printPage(2);
        System.out.println("Page count is " + hp.getPageCount());

        hp.printPage(3);
        System.out.println("Page count is " + hp.getPageCount());
    }
}
