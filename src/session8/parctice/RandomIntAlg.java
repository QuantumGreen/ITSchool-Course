package session8.parctice;

import java.util.Random;

public class RandomIntAlg {

    public static void main(String[] args) {
        printRandomNumber();
    }

    public static void printRandomNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt(1, 17);
        System.out.println(randomNumber);
    }
}
