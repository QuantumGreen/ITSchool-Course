package session4_boolean_algebra.practice;

import java.util.Scanner;

public class DecisionConstructs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number:");
//        int number = sc.nextInt();
        int number = 11;

        if(number>0){
            System.out.println("The number is positive.");
        } else if (number<0){
            System.out.println("The number is negative.");
        } else {
            System.out.println("number is zero.");
        }

        char ch = 'c';
        if(Character.isUpperCase(ch)){
            System.out.printf("%s is uppercase\n",ch);
        } else if (Character.isLowerCase(ch)){
            System.out.printf("%s is uppercase\n",ch);
        } else if (Character.isDigit(ch)){
            System.out.printf("%s is a digit\n",ch);
        } else {
            System.out.printf("%s is a special character\n",ch);
        }

    }
}
