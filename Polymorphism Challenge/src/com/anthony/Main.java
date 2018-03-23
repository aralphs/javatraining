package com.anthony;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String startEngine(){
        return("Engine Started");
    }

    public String accelerate(){
        return getClass().getSimpleName() + " acclerating";
    }

    public String brake(){
        return getClass().getSimpleName() + "Car braking";

    }

    public String getName(){
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class BMW extends Car{
    public BMW() {
        super(6, "BMW");
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " is braking";
    }

}

class Audi extends Car{
    public Audi() {
        super(4, "Audi");
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " is braking";
    }
}

class Lambo extends Car{
    public Lambo() {
        super(8, "Lambo");
    }
}

public class Main {

    public static void main(String[] args) {
        Car car1 = new BMW();
        System.out.println("Car name is :" + car1.getName());
        System.out.println("There is " + car1.getCylinders() + " cyclinders");
        System.out.println(car1.startEngine());
        System.out.println(car1.accelerate());
        System.out.println(car1.brake());

        Car car2 = new Audi();
        System.out.println("Car name is :" + car2.getName());
        System.out.println("There is " + car2.getCylinders()+ " cyclinders");
        System.out.println(car2.startEngine());
        System.out.println(car2.accelerate());
        System.out.println(car2.brake());

        Car car3 = new Lambo();
        System.out.println("Car name is :" + car3.getName());
        System.out.println("There is " + car3.getCylinders() + " cyclinders");
        System.out.println(car3.startEngine());
        System.out.println(car3.accelerate());
        System.out.println(car3.brake());


    }
}
