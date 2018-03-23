package com.anthony;

public class Room {

    private Chair chairs;
    private Table table;
    private String roomName;
    private Dimensions dimensions;

    public Room(Chair chairs, Table table, Dimensions dimensions, String roomName) {
        this.chairs = chairs;
        this.table = table;
        this.roomName = roomName;
        this.dimensions = dimensions;
    }

    public void sit (){
        pullOutChair();
        chairs.sitAtChair(true);

    }

    private void pullOutChair(){
        System.out.println("Chair pulled out");

    }

    public void chairInfo(){
        System.out.println("Each chair has " + chairs.getNumOfLegs() + " legs, with dimensions " );
        chairs.getDimensions();
    }
}
