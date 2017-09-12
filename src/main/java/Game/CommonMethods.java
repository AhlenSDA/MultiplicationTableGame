package Game;

import java.util.Random;
import java.util.Scanner;

class CommonMethods {

    private static int attempt = 0;
    private static int score = 0;
    static int userAnswer;


    static void showScore() {
        double correctAnswers = Math.round(((double) score / (attempt - 1) * 100));
        System.out.println("\nYour score is: " + score + "/" + (attempt - 1) + "\nCorrect answers: " + correctAnswers + "%");
    }

    static void drawRandomNumbers(int minDrawnValue, int maxDrawnValue) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber_1 = random.nextInt((maxDrawnValue - minDrawnValue) + 1) + minDrawnValue;
        int randomNumber_2 = random.nextInt((maxDrawnValue - minDrawnValue) + 1) + minDrawnValue;
        int multiplyResult = randomNumber_1 * randomNumber_2;

        do {
            System.out.print("[" + score + "/" + (attempt + 1) + "] " + randomNumber_1 + " * " + randomNumber_2 + " = ");
            userAnswer = scanner.nextInt();
            if (userAnswer == multiplyResult) {
                attempt++;
                score++;
            } else {
                attempt++;
            }
        } while ((userAnswer != multiplyResult) && (userAnswer != 0));
    }
}
