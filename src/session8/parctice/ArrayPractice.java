package session8.parctice;

import javax.swing.*;
import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 8, 9, 4};

        sortArray(numbers);
        System.out.println("Printed array: "+ Arrays.toString(numbers));
        System.out.println("Binary search index value: " + Arrays.binarySearch(numbers,9));

        int firstArrayNumber = numbers[0];
        System.out.println("First array number: " + firstArrayNumber);
        printArrayAverage(numbers);

        String[][] matrix = {
                {"Ms","Mr"},
                {"Alice","John"},
        };
        print2DArray(matrix);
    }


    public static void sortArray(int[] array){
        Arrays.sort(array);
    }

    public static void printArrayAverage(int[] numbers) {
        float average = 0;
        for (int number : numbers) {
            average += number;
        }
        average /= numbers.length;
        System.out.println("Array's average: "+average);
    }

    public static void print2DArray(String[][] names) {
        for (int y = 0; y < names.length; y++) {
            for (int x = 0; x < names[0].length; x++) {
                System.out.print("'"+names[y][x]+"', ");
            }
            System.out.println();
        }
    }
}
