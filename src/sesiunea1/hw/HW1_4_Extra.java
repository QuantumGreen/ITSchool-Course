package sesiunea1.hw;
import java.util.Scanner;

public class HW1_4_Extra {
    public static void main(String[] args){
        //4. Simple Input/Output: Write a program that asks the user to enter two numbers, performs addition on those numbers, and prints out the result.
        double num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("please input first number:");
        num1 = sc.nextDouble();
        System.out.println("please input second number:");
        num2 = sc.nextDouble();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
