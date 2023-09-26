package session8.parctice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println("Started Program");

        for (int index = 0; index < 500000; index++) {
            arrayList.add(String.valueOf(index));
            linkedList.add(String.valueOf(index));
        }

        System.out.println("Inserted");


        long startTimerArrayList = System.currentTimeMillis();
        for (int index = 0; index < 100000; index++) {
//            System.out.print(index+" ");
            arrayList.add(0,String.valueOf(index));
        }
        long endTimerArrayList = System.currentTimeMillis();
        System.out.println("finished arraylist");


        long startTimerLinkedList = System.currentTimeMillis();
        for (int index = 0; index < 100000; index++) {
            linkedList.add(0,String.valueOf(index));
        }
        long endTimerLinkedList = System.currentTimeMillis();
        System.out.println("finished linkedList");


        System.out.println("total time for insterting 100000 elements at index 0 in arraylis: " + (endTimerArrayList-startTimerArrayList));
        System.out.println("total time for insterting 100000 elements at index 0 in linked list: " + (endTimerLinkedList - startTimerLinkedList));
    }
}
