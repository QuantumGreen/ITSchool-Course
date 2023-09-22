package session4_boolean_algebra.challege;

// 18. Write a Java program where you declare an integer array with 5 elements. Use a for loop to initialize the array such that each element is equal to its index incremented by 1. Then use another for loop to decrement each element by 1. Print the array before and after the decrement operation using a for-each loop.



public class hw18 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        for (int e : array) {
            System.out.print(e+" ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            array[i]--;
        }
        for (int e : array) {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
