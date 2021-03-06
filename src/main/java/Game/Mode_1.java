package Game;

import Application.InGameMenu;

import static Game.CommonMethods.userAnswer;

public class Mode_1 {

    public static void multiplyTwoInteger() {

        final int MIN_DRAWN_VALUE = 3;
        final int MAX_DRAWN_VALUE = 9;

        System.out.println("Have fun calculating!");
        System.out.println("Type 0 to quit application after you are done.\n");
        System.out.println("[Score/Attempt]");

        do {
            CommonMethods.drawRandomNumbers(MIN_DRAWN_VALUE, MAX_DRAWN_VALUE);
        } while (userAnswer != 0);

        CommonMethods.showScore();
        InGameMenu.showGameMenu();
    }
}
