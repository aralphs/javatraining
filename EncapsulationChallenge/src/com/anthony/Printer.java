package com.anthony;

public class Printer {
    private int tonerLevel = 100;
    private int numPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        if (tonerLevel >0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }

        System.out.println("Toner Level set to: " + this.tonerLevel);

        this.numPagesPrinted = 0;
        this.duplex = duplex;
    }

    public void printPage (int pages){
        this.numPagesPrinted += pages;
        System.out.println(pages + " Pages Printed");
    }

    public int getPageCount() {
        return numPagesPrinted;
    }
}
