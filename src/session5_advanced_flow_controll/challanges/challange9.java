package session5_advanced_flow_controll.challanges;

//9. For-Each Loop
//Given an array of integers, write a program that prints each number in the array followed by "Even" if the number is even, or "Odd" if the number is odd. Utilize a for-each loop for this task.

public class challange9 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 3, 4};
        printEvenOdd(arr);
    }

    public static void printEvenOdd(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
            if (e % 2 == 0) {
                System.out.print("Even");
            } else {
                System.out.print("Odd");
            }
            System.out.println();
        }
    }
}
