package session4_boolean_algebra.challage;

//2.  Write a Java program to declare two integer variables firstNumber and secondNumber with any values. Use an equality operator to compare these two numbers and print the result. Do the same for two String objects firstString and secondString with the same value, but use the equals() method for comparison. Print the result.


public class hw2 {
    public static void main(String[] args) {

        int firstNumber = 12;
        int seccondNumber = 13;

        System.out.println(firstNumber == seccondNumber);


        String stringOne = "str";
        String stringTwo = "str";

        System.out.println(stringOne.equals(stringTwo));
    }
}
