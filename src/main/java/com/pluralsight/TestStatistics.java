package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        double[] testScores = {47.0, 99.5, 75.0, 89.5, 80.0, 65.5, 71.0, 88.5, 100.0, 35.5};
        double sum = 0.0;
        for (double score : testScores) {
            sum += score;
        }
        double average = sum / testScores.length;
        double highScore = testScores[0];
        for (double score : testScores) {
            if (score > highScore) {
                highScore = score;
            }
    }
        double lowScore = testScores[0];
        for (double score : testScores) {
            if (score < lowScore) {
                lowScore = score;
            }
        }
        System.out.println("Average: " + average);
        System.out.println("High Score: " + highScore);
        System.out.println("Low Score: " + lowScore);
    }
}
