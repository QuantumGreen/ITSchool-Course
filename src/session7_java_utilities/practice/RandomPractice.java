package session7_java_utilities.practice;

import java.util.*;

public class RandomPractice {

    public static void main(String[] args) {
        Random random = new Random();

        for (int index = 0; index < 10; index++) {
            int randomInt = random.nextInt(100);

            System.out.println("UUID  " + index + ": " + UUID.randomUUID());
        }

        System.out.println();

        String[] fruits = {"apple", "banana", "cherry"};
        for (int i = 0; i < 3; i++) {
            String randomFruit = fruits[random.nextInt(fruits.length)];
            System.out.println(randomFruit);
        }

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Collections.shuffle(numbers, random);
        System.out.println("Shuffled list: " + numbers);
    }
}
