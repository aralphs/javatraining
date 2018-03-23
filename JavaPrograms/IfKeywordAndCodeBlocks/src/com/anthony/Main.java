package com.anthony;

public class Main {

    public static void main(String[] args) {

        int finalScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was: " + finalScore);

        finalScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was: " + finalScore);
        System.out.println("=====================================================================");

        int position = calculateHighScorePosition(1000);
        displayHighScorePosition("Dave", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Simon", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Matthew", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Richard", position);
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        } else if (score >= 500 && score <1000){
            return 2;
        } else if (score >= 100 && score <500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        int finalScore = 0;

        if(gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }

    }
}
