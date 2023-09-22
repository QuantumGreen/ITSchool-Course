package session1_java_basics.challenge;

import java.util.Scanner;

public class HW1_3 {

    static String formatBin(int nr) {
        String binStr = Integer.toBinaryString(nr);
        return ("00000000000000000000000000000000" + binStr).substring(binStr.length());
    }

    public static void main(String[] args) {
        //3. Operations: Write a program that performs various operations (addition, subtraction, multiplication, division, and modulus) on two numbers. The numbers can be hard-coded into the program. Print the result of each operation.
        double num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("please input first number:");
        num1 = sc.nextDouble();
        num1 = -25.4;
        System.out.println("please input second number:");
        num2 = sc.nextDouble();
        num2 = 25.2;

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        System.out.println();

        // #######################
        // extra stuff
        // | & ^ ~ << >> >>>

        int num1I = (int) num1; //doesn't work
        int num2I = (int) num2;

        String num1BinStr = formatBin(num1I);
        String num2BinStr = formatBin(num2I);

        System.out.printf("%5s is %s in binary%n", num1I, num1BinStr);
        System.out.printf("%5s is %s in binary%n", num2I, num2BinStr);
        System.out.println();
        System.out.printf("%s & \n%s = \n%s\n%n", num1BinStr, num2BinStr, formatBin(num1I & num2I));
        System.out.printf("%s | \n%s = \n%s\n%n", num1BinStr, num2BinStr, formatBin(num1I | num2I));
        System.out.printf("%s ^ \n%s = \n%s\n%n", num1BinStr, num2BinStr, formatBin(num1I ^ num2I));
        System.out.printf("~ %s =\n  %s\n%n", num1BinStr, formatBin(~num1I));
        System.out.printf("%s >>  1 =\n%s\n%n", num1BinStr, formatBin(num1I >> 1));
        System.out.printf("%s <<  1 =\n%s\n%n", num1BinStr, formatBin(num1I << 1));
        System.out.printf("%s >>> 1 =\n%s\n%n", num1BinStr, formatBin(num1I >>> 1));
//        System.out.printf("%s <<< 1 =\n%s\n%n", num1BinStr, formatBin(num1I <<< 1)); // doesn't exist

    }
}
