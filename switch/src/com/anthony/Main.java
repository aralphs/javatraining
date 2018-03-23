package com.anthony;

public class Main {

    public static void main(String[] args) {

        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3 or a 4 or a 5");
                break;

            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        char switchChar = 'F';

        switch(switchChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Char was an A, B, C, D or E");
                System.out.println("Actual Char was " + switchChar);
                break;
            default:
                System.out.println("Char was not found");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not sure what month it is");
        }
    }
}
