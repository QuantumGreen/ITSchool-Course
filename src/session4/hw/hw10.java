package session4.hw;

// 10. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo. Add some elements to listOne and assign listOne to listTwo. Now modify listOne by adding a new element. Print both lists and observe the output.


import java.util.ArrayList;
import java.util.zip.CheckedOutputStream;

public class hw10 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2 = list1;
        list1.set(0,42);

        System.out.println(list2);

    }
}
