package session14.practice;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Set<String> mySet = initialiseSet();
        displaySetElements(mySet);
    }

    private static void displaySetElements(Set<String> set){
        for (String elem : set) {
            System.out.println(elem);
        }
    }

    private static Set<String> initialiseSet(){
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("orange");
        set.add("apple");
        return set;
    }
}
