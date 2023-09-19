package session5_advanced_flow_controll.practice;

public class WhileExercises {

    public static void main(String[] args) {
        printNumbers();
    }

    public static void printNumbers() {
        int number = 1;
        while (number <= 10) {
            System.out.println(number);
            number++;
        }
    }

    public static void printGaussSum(int value) {
        int number = 1;
        int sum = 0;
        while (number < value) {
            sum += number;
            number++;
        }
        System.out.println("Sum: "+sum);
    }
}
