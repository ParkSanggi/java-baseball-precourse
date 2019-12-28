package domain;

import java.util.Arrays;
import java.util.Random;

public class SecretNumber {

    public static String make(int countOfCards) {
        int randomNumberLimit = 10;
        Random random = new Random();
        int[] randomNumbers = new int[countOfCards];
        int i = 0;
        while (i < countOfCards) {
            int newRandomNumber = (random.nextInt(randomNumberLimit));
            if (!isDuplicates(randomNumbers, newRandomNumber)) {
                randomNumbers[i] = newRandomNumber;
                i++;
            }
        }
        return Arrays.toString(randomNumbers).replaceAll("[^0-9]", "");
    }

    private static boolean isDuplicates(int[] array, int num) {
        for (int value : array) {
            if (value == num) {
                return true;
            }
        }
        return false;
    }
}
