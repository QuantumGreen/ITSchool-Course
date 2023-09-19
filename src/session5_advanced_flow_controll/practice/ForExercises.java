package session5_advanced_flow_controll.practice;

public class ForExercises {

    public static void main(String[] args) {
        printEvenNumbers(20);
        printFactorial(-3);

        String[] myArray = {"Apple", "Cherry", "Plum"};
        printArray(myArray);

        int[] intArray = {2, 3, 7, 43, 67};
        printArrayMaxValue(intArray);

        printSearchedValue(intArray, 7);

        int[][] intMatrix = {{1, 2, 3}, {6, 9, 43}, {8, 1, 10}};
        print2DArray(intMatrix);
        System.out.println("Second value from first nested array"+intMatrix[0][1]);
    }

    public static void printEvenNumbers(int number) {
        for (int index = 0; index <= number; index += 2) {
            System.out.println(index);
        }
    }

    public static void printFactorial(int number) {
        boolean isValid = number < 0;
        if (isValid) {
            System.out.println("Please enter positive number");
            return;
        }

        int factorial = 1;
        for (int index = 1; index <= number; index++) {
            factorial *= index;
        }
        System.out.println("Factorial: " + factorial);

    }

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
    }

    public static void printArrayMaxValue(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int maxValue = array[0];
        for (int element : array) {
            if (element > maxValue) {
                maxValue = element;
            }
        }
        System.out.println(maxValue);
    }

    public static void printSearchedValue(int[] array, int value) {
        for (int number : array) {
            if (number == value) {
                System.out.println(value + " found");
                return;
//                break;
            }
        }
        System.out.println(value + " was not found");
    }

    public static void print2DArray(int[][] array) {
        for (int rowIndex = 0; rowIndex < array.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < array[0].length; columnIndex++) {
                int element = array[rowIndex][columnIndex];
                System.out.print(element + "\t");
            }
            System.out.print("\n");
        }
    }
}
