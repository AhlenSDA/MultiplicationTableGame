package Testing;

import java.util.Random;
import java.util.Scanner;

public class GameModes {

    // Game -> Mode_1 + Mode_2 how to join them together to minimize code

    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    private int randomNumber_1;
    private int randomNumber_2;

    private int multiplyResult;
    private int userAnswer;
    private int attempt = 0;
    private int score = 0;

    public static void gameMode_1() {

        final int MIN_DRAWN_VALUE = 2;
        final int MAX_DRAWN_VALUE = 9;

        System.out.println("Have fun calculating!");
        System.out.println("Type 0 to quit after you are done.\n");

        do {
            randomNumber_1 = MIN_DRAWN_VALUE + (random.nextInt(MAX_DRAWN_VALUE - 1));
            randomNumber_2 = MIN_DRAWN_VALUE + (random.nextInt(MAX_DRAWN_VALUE - 1));
            multiplyResult = (randomNumber_1 * randomNumber_2);
            calculateUserPoints();
        } while (userAnswer != 0);
    }

    public void gameMode_2() {

        int userInputMinRange1;
        int userInputMaxRange2;

        System.out.println("Please specify values range you want to practise with:");
        System.out.print("MIN value = ");
        userInputMinRange1 = scanner.nextInt();
        System.out.print("MAX value = ");
        userInputMaxRange2 = scanner.nextInt();

        do {
            randomNumber_1 = userInputMinRange1 + (random.nextInt(userInputMaxRange2 - 1));
            randomNumber_2 = userInputMinRange1 + (random.nextInt(userInputMaxRange2 - 1));
            multiplyResult = (randomNumber_1 * randomNumber_2);
            calculateUserPoints();
        } while (userAnswer != 0);
    }

    private void calculateUserPoints() {

            do {
                System.out.print(randomNumber_1 + " * " + randomNumber_2 + " = ");
               userAnswer = scanner.nextInt();
                if (userAnswer == multiplyResult) {
                    attempt++;
                    score++;
                } else
                    attempt++;
            } while ((userAnswer != multiplyResult) && (userAnswer != 0));

            double correctAnswers = Math.round(((double) score / (attempt - 1) * 100));
            System.out.println("\nYour score is: " + score + "/" + (attempt - 1) + "\nCorrect answers: " + correctAnswers + "%"); // (attempt - 1) because if userAnswer == 0, then attempt still gets ++;
        }
    }


