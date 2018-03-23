package com.anthony;

public class Main {

    public static void main(String[] args) {

        Vehicle test = new Vehicle("bike", 1, 2, 600, 6, 1);

        System.out.println("engine size is: " + test.getEngineSize());
        Car Metro = new Car("Metro", 1000, 5, 1, 12);

        System.out.println("colour of car is " + Metro.getColour());

        System.out.println("Current gear is " + Metro.getCurrentGear());

        Metro.accelerate(10);

        Metro.changeGear(3);

        System.out.println("Current gear is " + Metro.getCurrentGear());
    }
}
