package session9.practice;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String name1 = "Maria";
        String name2 = "Maria";

        System.out.println(name1 == name2);

        List<String> names1 = new ArrayList<>();
        names1.add("Ionut");

        List<String> names2 = new ArrayList<>();
        names2.add("Ionut");

        System.out.println(names1.get(0) == names2.get(0));

    }
}
