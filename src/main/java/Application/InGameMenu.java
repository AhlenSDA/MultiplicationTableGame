package Application;

import Game.Mode_1;
import Game.Mode_2;

import java.util.Scanner;

public class InGameMenu {

    public static void showGameMenu() {
        System.out.println("------------GAME MENU-----------------");
        System.out.println("1. Standard multiplication table");
        System.out.println("2. Number range specified by User");
        System.out.println("3. EXIT application");
    }

    static void chooseGameMode() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nChoose mode: ");

        int userInput = 0;

        do {
            do {
                try {
                    userInput = scanner.nextInt();
                    switch (userInput) {
                        case 1:
                            Mode_1.multiplyTwoInteger();
                            break;
                        case 2:
                            Mode_2.multiplyTwoSpecifiedValues();
                            break;
                        case 3:
                            System.out.println("\nYou quit application. Goodbye :)");
                            return;
                        default:
                            System.out.print("Not found! Choose again game mode: ");
                    }
                } catch (Exception InputMismatchException) {
                    scanner.nextLine();
                    System.out.print("Wrong input!\nChoose again: ");
                }
            } while (userInput <= 0 || userInput > 3);
        } while (userInput != 3);
    }
}
