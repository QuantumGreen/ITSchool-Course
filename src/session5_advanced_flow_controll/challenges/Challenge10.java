package session5_advanced_flow_controll.challenges;

import java.util.Scanner;

//10. Jump Statements
//Create a menu-driven program where the user is presented with options:
//
//Print "Hello World"
//Print the user's name.
//Exit.
//Based on the user's input, perform the necessary action. Once an action is completed, show the menu again, unless the user chooses the Exit option. Use jump statements to control the flow of the program.

public class Challenge10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selectedOption = 0;
        SELECT:
        while (selectedOption != 3) {
            System.out.println("Please select an option");
            System.out.println("1 - print hello world");
            System.out.println("2 - print your name");
            System.out.println("3 - exit");
            selectedOption = sc.nextInt();
            switch (selectedOption) {
                case 1 -> {
                    System.out.println("Hello World!");
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("What is your name");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Hi " + name);
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Exiting program");
                    break SELECT;
                }
                default -> {
                    System.out.println("no such option, try again");
                }
            }
        }

        sc.close();
    }
}
