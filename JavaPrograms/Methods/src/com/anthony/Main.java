package com.anthony;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore(true , 800, 5, 100);
        System.out.println("your score was: " + newScore);

        int highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("your score was: " + highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = 0;
        if(gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
//            System.out.println("Your final score was: " + finalScore);
        }
        return finalScore;
    }
}
