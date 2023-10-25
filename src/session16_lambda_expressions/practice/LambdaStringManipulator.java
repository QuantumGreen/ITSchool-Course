package session16_lambda_expressions.practice;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaStringManipulator {

    public static void main(String[] args) {
        Function<String, Integer> stringLengthFinder = str -> str.length();
        System.out.println(stringLengthFinder.apply("cool dude"));

        List<String> myList = Arrays.asList("Bob","alice","Taylor");
        // with stream and lambda
        myList.stream()
                .filter(name -> name.startsWith("B"))
                .forEach(System.out::println);

        // without lambda
        for (String name : myList) {
            if(name.startsWith("B")){
                System.out.println(name);
            }
        }
    }
}
