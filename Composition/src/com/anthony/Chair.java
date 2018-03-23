package com.anthony;

public class Chair {

    private int numOfLegs;
    private Dimensions dimensions;
    private String name;
    private Boolean satAtChair;

    public Chair(int numOfLegs, Dimensions dimensions, String name) {
        this.numOfLegs = numOfLegs;
        this.dimensions = dimensions;
        this.name = name;
        this.satAtChair = false;
    }

    public void sitAtChair (Boolean sitdown){
        this.satAtChair = true;
        System.out.println("Sat at Chair");
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void getDimensions() {
        System.out.println("W " + dimensions.getWidth() + " D " + dimensions.getDepth() + " H " + dimensions.getHeight());
    }

    public String getName() {
        return name;
    }

}
