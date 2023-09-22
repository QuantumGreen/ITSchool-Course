package session5_advanced_flow_controll.challenges;

//3. Counting Negative Numbers
//Given an array of integers, write a program to count and print the number of negative integers in the array.

public class Challenge03 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, -1, 2, -5};
        System.out.println(countNegative(arr));

    }

    static int countNegative(int[] arr) {
        int negativeCounter = 0;
        for (int e : arr) {
            if (e < 0) {
                negativeCounter++;
            }
        }
        return negativeCounter;
    }
}
