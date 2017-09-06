package GameMode;

import java.util.Random;
import java.util.Scanner;

public class Mode_2 {

    public static void multiplyTwoSpecifiedValues(){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber_1;
        int randomNumber_2;
        int userInputMinRange1;
        int userInputMaxRange2;
        int multiplyResult;
        int userAnswer;
        int attempt = 0;
        int score = 0;

        System.out.println("Have fun calculating!");
        System.out.println("Type 0 to quit after you are done.\n");

        System.out.println("Please specify values range you want to practise with:");
        System.out.print("MIN value = ");
        userInputMinRange1 = scanner.nextInt();
        System.out.print("MAX value = ");
        userInputMaxRange2 = scanner.nextInt();

        do {
            randomNumber_1 = userInputMinRange1 + (random.nextInt(userInputMaxRange2 - 1));
            randomNumber_2 = userInputMinRange1 + (random.nextInt(userInputMaxRange2 - 1));
            multiplyResult = (randomNumber_1 * randomNumber_2);

            do {
                System.out.print(randomNumber_1 + " * " + randomNumber_2 + " = ");
                userAnswer = scanner.nextInt();
                if (userAnswer == multiplyResult) {
                    attempt++;
                    score++;
                } else
                    attempt++;

            } while ((userAnswer != multiplyResult) && (userAnswer != 0));

        } while (userAnswer != 0);

        double correctAnswers = Math.round(((double) score / (attempt-1) * 100));
        System.out.println("\nYour score is: " + score + "/" + (attempt - 1) + "\nCorrect answers: " + correctAnswers + "%"); // (attempt - 1) because if userAnswer == 0, then attempt still gets ++;
    }
}