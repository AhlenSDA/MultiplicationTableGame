package Game;

import Application.InGameMenu;

import java.util.Scanner;

import static Game.CommonMethods.userAnswer;

public class Mode_2 {

    public static void multiplyTwoSpecifiedValues(){

        Scanner scanner = new Scanner(System.in);

        int userInputMinRange1;
        int userInputMaxRange2;

        System.out.println("Have fun calculating!");
        System.out.println("Type 0 to quit application after you are done.\n");

        System.out.println("Please specify values range you want to practise with:");
        System.out.print("MIN value = ");
        userInputMinRange1 = scanner.nextInt();
        System.out.print("MAX value = ");
        userInputMaxRange2 = scanner.nextInt();
        System.out.println("\n[Score/Attempt]");

        do {
            CommonMethods.drawRandomNumbers(userInputMinRange1, userInputMaxRange2);
        } while (userAnswer != 0);

        CommonMethods.showScore();
        InGameMenu.showGameMenu();
    }
}