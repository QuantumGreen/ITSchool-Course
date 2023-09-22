package session3_operators.challege;

// 2. Create a Java program where you increment and decrement the same variable. Display the value of the variable after each operation.

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n++;
        System.out.println(n);
        n--;
        System.out.println(n);
    }
}
