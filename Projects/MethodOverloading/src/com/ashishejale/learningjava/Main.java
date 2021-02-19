package com.ashishejale.learningjava;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Player1", 1000);
        System.out.println("New Score is :" + newScore);
        calculateScore(2000);
        calculateScore();
    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore (int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }


    public static int calculateScore () {
        System.out.println("No player named, no score.");
        return 0;
    }
}
