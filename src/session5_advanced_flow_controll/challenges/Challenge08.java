package session5_advanced_flow_controll.challenges;

//8. For Loop
//Write a program that prints the first 10 numbers in the Fibonacci series. Use a for loop to accomplish this.

public class Challenge08 {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
