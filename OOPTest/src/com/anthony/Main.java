package com.anthony;

class burger {
    private String meat;
    private String breadRoll = "white roll";
    private Double basePrice = 1.00;
    private int numAdditions = 4;

    public burger(String breadRoll, Double basePrice) {
        this.meat = "beef";
        this.breadRoll = breadRoll;
        this.basePrice = basePrice;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public int getNumAdditions() {
        return numAdditions;
    }


}

class healthyBurger extends burger{

    public int additions;

    public healthyBurger(int additions) {
        super("Brown Rye Bread", 2.00);
        this.additions = additions;
    }

    public int getAdditions() {
        return additions;
    }
}

class deluxeBurger extends burger{

    public int additions;

    public deluxeBurger(int additions) {
        super("White Roll", 4.00);
        this.additions = additions;
    }

    public int getAdditions() {
        return additions;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        burger burger1 = new burger("white roll", 1.00);
        System.out.println(burger1.getBasePrice());

        healthyBurger burger2 = new healthyBurger(6);
        System.out.println(burger2.getBasePrice());

        deluxeBurger burger3 = new deluxeBurger(2);
        System.out.println(burger3.getBasePrice());
    }
}
