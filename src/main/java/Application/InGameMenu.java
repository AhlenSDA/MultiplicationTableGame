package Application;

import GameMode.Mode_1;

class InGameMenu {

    static void showGameMenu() {
        System.out.println("---------MENU---------");
        System.out.println("1. Standard multiplication table");
        System.out.println("2. Number range specified by User");
        System.out.println("3. EXIT application");
    }

    static void chooseGameMode(int userInput) {

        do { // How to make switch statement not to spam default option when wrong case is choose???
            switch (userInput) {
                case 1:
                    Mode_1.multiplyTwoInteger();
                    break;
                case 2:
                    // Method that starts game mode nr. 2
                    break;
                case 3:
                    return; // return is the statement I use here to exit application, I did not want to use System.exit

                default:
                    System.out.println("Not found! Choose again game mode.");
            }
        } while (userInput <= 0 || userInput > 3);
    }
}

