package session16_lambda_expressions.practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class LambdaPractice {

    public static void main(String[] args) {
        intSum getSum = (a, b) -> a + b;
        intMultiply getMultiply = (a, b) -> a * b;

        System.out.println(getSum.sum(12, 3));
        System.out.println(getMultiply.multiply(12, 3));

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        //using lambda
        names.forEach(name -> System.out.println(name));

        // using for
        for (String name : names) {
            System.out.println(name);
        }
    }
}
