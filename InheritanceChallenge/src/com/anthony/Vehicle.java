package com.anthony;

public class Vehicle {

    private String name;
    private int seats;
    private int wheels;
    private int engineSize;
    private int numberOfGears;
    private int currentGear;

    public Vehicle(String name, int seats, int wheels, int engineSize, int numberOfGears, int currentGear) {
        this.name = name;
        this.seats = seats;
        this.wheels = wheels;
        this.engineSize = engineSize;
        this.numberOfGears = numberOfGears;
        this.currentGear = currentGear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public String getName() {
        return name;
    }

    public int getSeats() {
        return seats;
    }

    public int getWheels() {
        return wheels;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void move(int speed) {
        System.out.println("Vehicle moved at " + speed);
    }

    public void changeGear(int gear) {
        this.currentGear = gear;
        System.out.println(("Vehicle gear changed to: " + gear));
    }
}
