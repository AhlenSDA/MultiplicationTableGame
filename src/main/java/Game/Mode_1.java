package Game;

import java.util.Random;
import java.util.Scanner;

public class Mode_1 {

    public static void multiplyTwoInteger() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber_1;
        int randomNumber_2;
        final int MIN_DRAWN_VALUE = 2;
        final int MAX_DRAWN_VALUE = 9;
        int multiplyResult;
        int userAnswer;
        int attempt = 0;
        int score = 0;

        System.out.println("Have fun calculating!");
        System.out.println("Type 0 to quit after you are done.\n");

        do {
            randomNumber_1 = MIN_DRAWN_VALUE + (random.nextInt(MAX_DRAWN_VALUE - 1));
            randomNumber_2 = MIN_DRAWN_VALUE + (random.nextInt(MAX_DRAWN_VALUE - 1));
            multiplyResult = (randomNumber_1 * randomNumber_2);

            do {
                System.out.print(randomNumber_1 + " * " + randomNumber_2 + " = ");
                userAnswer = scanner.nextInt();
                if (userAnswer == multiplyResult) {
                    attempt++;
                    score++;
                } else
                    System.out.println("Wrong! Try again!");
                    attempt++;

            } while ((userAnswer != multiplyResult) && (userAnswer != 0));

        } while (userAnswer != 0);

        double correctAnswers = Math.round(((double) score / (attempt-1) * 100));
        System.out.println("\nYour score is: " + score + "/" + (attempt - 1) + "\nCorrect answers: " + correctAnswers + "%"); // (attempt - 1) because if userAnswer == 0, then attempt still gets ++;
    }
}
