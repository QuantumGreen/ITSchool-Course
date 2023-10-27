package session17_stream_optional.practice;

import session12.practice.run_time_polymorphism.fruit.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamPractice {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strings = Arrays.asList("apple", "banana", "peach", "watermelon");
        List<Product> products = Arrays.asList(new Product("Phone", 599.9934), new Product("Laptop", 2499.99));
        List<List<Integer>> multiDimList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

//        printEvenNumbers(numbers);
//        printEvenNumbersWithStream(numbers);
//        printStringBiggerThan(strings,5);
//        printStringsLength(strings);
//        printProductPrices(products);
//        printProductIncreasedPrices(products);
//        printFlatMap(multiDimList);
//        printSumOfNumbers(numbers);
//        printSortedProductByPrice(products);
//        PrintProcessedNumbers(numbers);
//        printAnyMatch(strings);

    }

    private static void printAnyMatch(List<String> strings) {
        boolean anyMatch = strings.stream()
                .filter(str -> str.length() > 5)
                .anyMatch(str -> str.startsWith("a"));
        System.out.println("we have a fruit bigger than 5 that starts with 'a':" + anyMatch);
    }

    private static void PrintProcessedNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .filter(num -> num > 20)
                .forEach(System.out::println);
    }

    private static void printSortedProductByPrice(List<Product> products) {
        List<Product> sortedProduct = products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();
        sortedProduct.forEach(product -> System.out.println(product.getName() + " " + product.getPrice()));
    }

    private static void printSumOfNumbers(List<Integer> numbers) {
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("sum of numbers: " + sum);
    }

    private static void printFlatMap(List<List<Integer>> multiDimList) {
        List<Integer> flatenedList = multiDimList.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println("Flattened list: " + flatenedList);
    }

    private static void printProductIncreasedPrices(List<Product> productList) {
        productList.stream()
                .map(product -> "$ " + String.format("%.2f", product.getPrice() * 1.10))
                .forEach(price -> System.out.print(price + ", "));
        System.out.println();
    }

    private static void printProductPrices(List<Product> productList) {
        productList.stream()
                .map(Product::getPrice)
                .forEach(price -> System.out.print(price + ", "));
        System.out.println();
    }

    private static void printStringBiggerThan(List<String> inputList, int minLength) {
        List<String> filteredList = new ArrayList<>();
        for (String element : inputList) {
            if (element.length() > minLength) {
                filteredList.add(element);
            }
        }
        System.out.println("traditional approach: " + filteredList);

        List<String> list = inputList.stream()
                .filter(e -> e.length() > minLength)
                .toList();
        System.out.println("stream approach: " + list);
    }

    private static void printStringsLength(List<String> stringList) {
        List<Integer> res = stringList.stream()
                .map(String::length)
                .toList();
        System.out.println("convert to lengths: " + res);
    }


    private static void printEvenNumbersWithStream(List<Integer> numbers) {
        // stream approach
        List<Integer> evenNumbersStreams = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println("Stream approach: " + evenNumbersStreams);
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        // traditional approach
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("Traditional approach: " + evenNumbers);
    }
}
