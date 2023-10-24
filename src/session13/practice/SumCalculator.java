package session13.practice;

public class SumCalculator {
    public static void main(String[] args) {
        int[] integers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : integers) {
            sum += number;
        }
        System.out.println("The sum of the elements int the list (whatever) is " + sum);
    }
}
