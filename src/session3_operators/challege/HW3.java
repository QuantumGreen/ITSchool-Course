package session3_operators.challege;

import java.util.Scanner;

// 3. Write a program to check if a number is positive or negative using logical complement operator.
public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=0){
            System.out.println("number is possitive");
        }
        else{
            System.out.println("number is negative");
        }
    }
}
