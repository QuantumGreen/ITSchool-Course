package session7_java_utilities.practice;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
//        String input = scanner.nextLine();
//        System.out.println("you entered: " + input);

//        printConsoleSum(scanner);
        printConsoleAverage(scanner);
    }

    public static void printConsoleSum(Scanner scanner){
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the first number:");
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

    public static void printConsoleAverage(Scanner scanner){
        int average = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number "+(i+1)+": ");
            average += scanner.nextInt();
        }
        System.out.println(average/5.);
    }
}
