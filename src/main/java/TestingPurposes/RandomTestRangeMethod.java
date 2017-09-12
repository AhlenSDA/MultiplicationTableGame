package TestingPurposes;

import java.util.Random;

public class RandomTestRangeMethod {

    public static void main(String[] args) {

        int minRange = 5;
        int maxRange = 10;

        methodBy_StackOverFlow(minRange, maxRange);

    }

    private static void methodBy_StackOverFlow(int minRange, int maxRange) {

        Random random = new Random();
        int falseAttempt = 0;
        int maxValueCounter = 0;
        int minValueCounter = 0;

        // sprawdzenie poprawnosci dzialania metody drawRandomNumbers poprzez wyszukanie
        // najmniejszej i najwiekszej wartosci zadanego przedzialu liczbowego

        for (int i = 0; i < 1000; i++) {

            int randomNumber_1 = random.nextInt((maxRange - minRange) + 1) + minRange;

            if (randomNumber_1 == minRange) {
                System.out.println(randomNumber_1 + "   [MIN]");
                minValueCounter++;
            } else if (randomNumber_1 == maxRange) {
                System.out.println(randomNumber_1 + "           [MAXIMUM]");
                maxValueCounter++;
            } else if (randomNumber_1 <= maxRange && randomNumber_1 >= minRange) {
                System.out.println(randomNumber_1);
            } else {
                falseAttempt++;
                System.out.println(randomNumber_1 + " false " + "[" + falseAttempt + "]");
            }
        }
        System.out.println("Counter of MIN: " + minValueCounter);
        System.out.println("Counter of MAX: " + maxValueCounter);
    }
}




