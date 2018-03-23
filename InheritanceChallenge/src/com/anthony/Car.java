package com.anthony;

public class Car extends Vehicle {

    private int colour;

    public Car(String name, int engineSize, int numberOfGears, int currentGear, int colour) {
        super(name, 4, 4, engineSize, numberOfGears, currentGear);
        this.colour = colour;
    }

    public int getColour() {
        return colour;
    }

    public void accelerate(int speed){
        System.out.println("car.accelerate() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Car.move() called");
        accelerate(speed);
        super.move(speed);
    }
}
