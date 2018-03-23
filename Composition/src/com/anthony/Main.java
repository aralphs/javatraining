package com.anthony;

public class Main {

    public static void main(String[] args) {

//        Dimensions dimensions = new Dimensions(20, 20, 5);
//        Case theCase = new Case("220B", "Dell", "240", dimensions);
//
//        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540, 1440));
//
//        Motherboard theMotherboard = new Motherboard("BK-200", "ASUS", 4 , 6, "v2.44");
//
//        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//
//        thePC.powerUp();

        Dimensions chairDimensions = new Dimensions(30, 50, 30);
        Dimensions tableDimensions = new Dimensions(100, 60, 60);
        Dimensions roomDimensions = new Dimensions(400, 100, 300);

        Chair chairs = new Chair(4, chairDimensions, "dining chair");
        Table table = new Table(6, tableDimensions, "dining table");
        Room diningRoom = new Room(chairs, table, roomDimensions, "Dining Room");

        diningRoom.sit();
        diningRoom.chairInfo();
    }
}
