package com.anthony;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 1;
        while (count != 6){
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("=============");
        count = 1;
        while(true) {
            if (count == 6) {
                break;
            }
                System.out.println("Count value is " + count);
                count++;
        }

        System.out.println("=============");
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);

        System.out.println("=============");
        int number = 5;
        int newCount = 0;
        int finishNumber = 20;
        while (number <= finishNumber) {

            if(!isEvenNumber(number)) {
                number++;
                continue;
            }
            if (newCount == 5){
                break;
            }
            System.out.println("Even number " + number);
            newCount++;
            number++;
        }
        System.out.println("Total even numbers found = " + newCount);

//        if (isEvenNumber(number)) {
//            System.out.println("Even number");
//        } else {
//            System.out.println("Not even number");
//        }
    }

    public static boolean isEvenNumber (int value) {
        if (value % 2 == 0 ){
            return true;
        } else {
            return false;
        }
    }
}
