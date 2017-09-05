package JustSomeTests;

import java.util.Random;

public class MakeTest {

    public static void main(String[] args) {

        Random random = new Random();

//        int randomNumber_1 = random.nextInt(10);
//        System.out.println("Random number from 0 to 9 = " + randomNumber_1);

        int min = -5;
        int max = 20;

        System.out.println("Losowanie liczby z przedzialu od " + min + " do " + max);
        while (true) {

            int randomNumber_2 = min + random.nextInt(max - 1);
            boolean correct = (randomNumber_2 >= min && randomNumber_2 <= max);
            System.out.println("<2, 9> = " + randomNumber_2 + "     " + correct);


        }
    }
}