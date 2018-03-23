package com.anthony;

public class Main {

    public static void main(String[] args) {
	// write your code here

//    Player player = new Player();
//    player.name = "Anthony";
//    player.health = 20;
//    player.weapon = "Sword";
//
//    int damage = 10;
//    player.loseHealth(damage);
//    System.out.println("Remaining health = " + player.healthRemain());
//
//    damage = 11;
//    player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemain());

        EnhancedPlayer player = new EnhancedPlayer("Anthony", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());

    }
}
