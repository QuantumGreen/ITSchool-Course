package session4.hw;

// 14. Write a Java program where you declare an integer variable counter with a value of 0. Use the increment operator to increase the value of counter by 1 and then print the value. After that, use the decrement operator to decrease the value of counter by 1 and then print the value.


import java.lang.invoke.MutableCallSite;

public class hw14 {
    public static void main(String[] args) {
        int mynum = 0;
        mynum++;
        System.out.println(mynum);
        mynum--;
        System.out.println(mynum);
    }
}
