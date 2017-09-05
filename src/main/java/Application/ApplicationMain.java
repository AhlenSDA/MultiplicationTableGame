package Application;

import java.util.Scanner;

public class ApplicationMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        InGameMenu.showGameMenu();
        InGameMenu.chooseGameMode(scanner.nextInt());

    }
}
