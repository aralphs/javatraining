package com.company;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(1000);
        calculateScore();

        calcFeetAndInchesToCentimetres(7, 5);
//        System.out.println("Full value = " + fullValue + " centimetres");
//        double feet = calcFeetAndInchesToCentimetres(14);
//        System.out.println("Other value = " + feet + " feet");
//        double otherValue = calcFeetAndInchesToCentimetres(feet, 14);
//        System.out.println("Other value converted into centimetres = " + otherValue);

        calcFeetAndInchesToCentimetres(100);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player name score 0 points");
        return 0;
    }


    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {

        if ((feet <0 ) || ((inches < 0) || (inches >12))) {
            System.out.println("Invalid feet or inches");
            return -1;
        }

        double centimetres = (feet * 12) * 2.54;
        centimetres += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimetres + " cm");
        return centimetres;
    }

    public static double calcFeetAndInchesToCentimetres(double inches) {

        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches us equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimetres(feet, remainingInches);

    }


//
//    public static double calcFeetAndInchesToCentimetres (double feet, double inches){
//        if (feet >= 0 && inches >=0 && inches <=12){
//            double answer = ((feet * 12) + inches) * 2.54 ;
//            return answer;
//        } else {
//            return -1;
//        }
//    }

//    public static double calcFeetAndInchesToCentimet res (double inches){
//        if (inches >=0){
//            double feet = inches / 12;
//     //       double answer = calcFeetAndInchesToCentimetre(feet, inches);
//            return feet;
//        } else {
//            return -1;
//        }
//    }

}
