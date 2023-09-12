package session3.hw;

// 4. Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1.

public class HW4 {
    public static void main(String[] args) {
        int i = 1;
        int n = 10;
        while(i<=n){
            System.out.println(i);
            i++;
        }
        i--;
        i--;
        while(i>=1) {
            System.out.println(i);
            i--;
        }
    }
}
