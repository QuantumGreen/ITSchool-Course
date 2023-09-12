package session4;

import java.util.Arrays;

public class LoopPractice {
    public static void main(String[] args) {
        for (int index = 0; index<10; index++){
            System.out.println(index);
        }

        int[] myArray = {1,5,7,10,29};
        printArray(myArray);

        System.out.println();
        printEvenNumbers(100);
    }
    public static void printArray(int[] numbers){
        for (int number: numbers){
            System.out.print(number);
        }
        System.out.println();
    }

    public static void printEvenNumbers(int limitValue){
        for(int i=0;i<=limitValue; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
