package session4_boolean_algebra.challage;

// 16. Write a Java program where you use unary operators to perform a series of transformations on an integer variable number initialized to 50. First, negate number, then take the absolute value, and finally increment it by 1. Print the result at each step.


public class hw16 {
    public static void main(String[] args) {
        int number = 50;
        number = -number;
        System.out.println(number);
        number = Math.abs(number);
        System.out.println(number);
        number++;
        System.out.println(number);

    }
}
