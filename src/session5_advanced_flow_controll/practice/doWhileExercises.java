package session5_advanced_flow_controll.practice;

public class doWhileExercises {

    public static void main(String[] args) {
        printNumbers();
        printReverseCounter();
    }

    private static void printNumbers() {
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number <= 10);
    }

    private static void  printReverseCounter() {
        int number = 10;
        do {
            System.out.println(number);
            number--;
        } while (number >= 1);
    }
}
