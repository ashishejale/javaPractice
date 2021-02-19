package com.ashishejale.learningjava;

public class Main {

    public static void main(String[] args) {
        String name = "Player 1";
        int score = 1500;
        int position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        name = "Player 2";
        score = 900;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        name = "Player 3";
        score = 400;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        name = "Player 4";
        score = 50;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

    }

    public static int calculateHighScorePosition(int score) {

//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;

        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }

    public static void displayHighScorePosition(String name, int position) {

        System.out.println( name + " managed to get into position "
                            + position + " on the high score table");
    }
}
