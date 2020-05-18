package com.company;

public class Main {

    public static void main(String[] args) {
        int highScore1 = calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        int highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Tim", highScorePosition);


    }



    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }

    }

    public static void displayHighScorePosition(String playersName, int playersPosition) {
        System.out.println(playersName +  "managed to get into the position " + playersPosition);
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000){
            System.out.println("the score is >= 1000");
            return 1;
        } else if (playerScore >= 500) {
            System.out.println("the score is between 1000 and 500");
            return 2;
        } else if (playerScore >= 100 ) {
            System.out.println("the score is between 100 and 500");
            return 3;
        } else {
            System.out.println("the score is pretty bad");
            return 4;
        }
    }

}
