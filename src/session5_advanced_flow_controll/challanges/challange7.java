package session5_advanced_flow_controll.challanges;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


//7. Do-While Loop
//Create a program where the user is prompted to guess a predefined number. After each guess, the program should inform the user if the guess is too high or too low. The program should keep prompting the user until they guess correctly. Using a do-while loop, ensure the user is always asked at least once.

public class challange7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int num = rnd.nextInt(100) + 1;
        System.out.println("I am the magic ~gene!");
        System.out.println("Guess my number, its between 1 and 100");
        int guessedNum = -1;
//        guessedNum = num;
        do {
            guessedNum = sc.nextInt();
            if (guessedNum > num) {
                System.out.println("Woah buster too big, try again");
            }
            if (guessedNum < num) {
                System.out.println("Sorry mate too small, dream bigger, try again");
            }
        } while (guessedNum != num);
        System.out.println("Juuuuuust right...");
        System.out.println("the number was indeed " + num);
        System.out.println("CONGRATULATIONS!");
        try {
            File creditsFile = new File("src/session5_advanced_flow_controll/challanges/challange7 credits.txt");
            Scanner creditsScanner = new Scanner(creditsFile);
            while (creditsScanner.hasNextLine()) {
                System.out.println(creditsScanner.nextLine());
                try {
                    TimeUnit.MILLISECONDS.sleep(1200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            creditsScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Errors!");
            e.printStackTrace();
        }
        sc.close();
    }
}
