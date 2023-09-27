package session8.challenge;

import java.util.*;

public class Challenge1_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Create a shopping list with Array and print the values
        String[] shoppingList = {"apples", "bananas", "milk", "eggs"};
        System.out.println(Arrays.toString(shoppingList));
        System.out.println();

        // 2. Create a wishlist for christmas with ArrayList and print the values
        List<String> christmasWhishlist = new ArrayList<>();
        christmasWhishlist.add("Teddy");
        christmasWhishlist.add("Train Set");
        christmasWhishlist.add("Remote Plane");
        System.out.println(christmasWhishlist);
        System.out.println();

        // 3. Create
        //	2 empty ArrayLists: studentList and graduateStudentList
        //	populate studentList with 10 students
        //	copy values from studentList to graduateStudentList
        //	iterate through graduateStudentList and print each graduated student
        List<String> studentList = new ArrayList<>();
        List<String> graduateStudentList = new ArrayList<>();
        studentList.add("Gabi");
        studentList.add("Marius");
        studentList.add("Vixen");
        studentList.add("Dan");
        studentList.add("Robert");
        studentList.add("Luigi");
        studentList.add("Mircea");
        studentList.add("Cata");
        studentList.add("Laurentiu");
        studentList.add("Sam");
        graduateStudentList.addAll(studentList); // this does work, the elements are not sent by reference
//        studentList.set(0,"cool person");
//        System.out.println(graduateStudentList.get(0));
        System.out.println();

        // 4. Given an array of 10 integers, count how many of them are even numbers and how many are odd. Print out both counts.
        int[] ex4Array = new int[]{2, 2, 2, 2, 3, 3, 3, 3, 3, 3};
        int ex4EvenCount = 0;
        for (int num : ex4Array) {
            if (num % 2 == 0) {
                ex4EvenCount++;
            }
        }
        System.out.println(Arrays.toString(ex4Array));
        System.out.println("even count:" + ex4EvenCount);
        System.out.println("odd count:" + (ex4Array.length - ex4EvenCount));
        System.out.println();

        //5. Create an ArrayList that stores city names. Add at least five city names initially. Then, prompt the user to add a city name. If the city name is already in the list, display a message saying it's a duplicate; otherwise, add it to the list.
        List<String> cityNames = new ArrayList<>();
        cityNames.add("Bucharest");
        cityNames.add("London");
        cityNames.add("Paris");
        cityNames.add("Kyiv");
        cityNames.add("Dublin");

        System.out.println("Please Enter City Name:");
        boolean isDuplicate = true;
        while (isDuplicate) {
            String cityEntered = scanner.nextLine();
            isDuplicate = false;
            for (String cityName : cityNames) {
                if (cityName.equals(cityEntered)) {
                    isDuplicate = true;
                    System.out.println("City is a duplicate, please try again.");
                }
            }
            if (!isDuplicate) {
                cityNames.add(cityEntered);
                System.out.println("Added city " + cityEntered);
            }
        }
        System.out.println();

        // 6. Given a LinkedList storing student names, write a program that checks if a particular student name exists in the list. If it does, remove that name from the list.
        List<String> studentNames = new LinkedList<>();
        studentNames.add("Sam");
        studentNames.add("Bob");
        studentNames.add("Bill");
        removeStudent(studentNames, "Bob");
        System.out.println();

        // 7. Create an ArrayList containing names of fruits. Implement a custom sorting mechanism to arrange them in descending order based on their length. If two fruits have the same length, sort them in alphabetical order.

        // I will use bubble sort because it's easy to implement, normally I would use quicksort
        // descending length. if same descending alphabetical
        List<String> fruit = new ArrayList<>();
        fruit.add("prune");
        fruit.add("banana");
        fruit.add("cherry");

        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < fruit.size() - 1; i++) {
                String currentFruit = fruit.get(i);
                String nextFruit = fruit.get(i + 1);
                boolean swap = false;
                if (currentFruit.length() < nextFruit.length()) {
                    swap = true;
                } else if (currentFruit.length() == nextFruit.length()) {
                    if (currentFruit.compareTo(nextFruit) < 0) {
                        swap = true;
                    }
                }
                if (swap) {
                    changed = true;
                    fruit.set(i + 1, currentFruit);
                    fruit.set(i, nextFruit);
                }
            }
        }
        for (String fr : fruit) {
            System.out.println(fr);
        }
        System.out.println();

        // 8. In an array of strings representing movie titles, implement a linear search method to find whether a given movie title exists. If it does, print out its position in the array.
        List<String> movieNames = new ArrayList<>();
        movieNames.add("Titanic");
        movieNames.add("The Sound of Music");
        movieNames.add("Casablanca");
        GetMovieIndex(movieNames, "The Sound of Music");
        System.out.println();

        // 9.Accept a string representation of a binary number, e.g., "1011". Convert this string into an Integer using the Integer wrapper class and the method that parses binary. Print out the decimal representation of this number.
        String binaryNumber = "1101";
        int parsedNumber = Integer.parseInt(binaryNumber, 2);
        System.out.println(binaryNumber);
        System.out.println(parsedNumber);
        System.out.println();

        scanner.close();
    }

    // 6. Given a LinkedList storing student names, write a program that checks if a particular student name exists in the list. If it does, remove that name from the list.
    static void removeStudent(List<String> studentNames, String studentToRemove) {
        for (int i = 0; i < studentNames.size(); i++) {
            String currentStudent = studentNames.get(i);
            if (currentStudent.equals(studentToRemove)) {
                System.out.println("Found match! Removing student " + studentToRemove);
                studentNames.remove(i);
                return;
            }
        }
        System.out.println("Didn't find any student");
    }

    // 8. In an array of strings representing movie titles, implement a linear search method to find whether a given movie title exists. If it does, print out its position in the array.
    static int GetMovieIndex(List<String> movieNames, String searchedMovie) {
        for (int i = 0; i < movieNames.size(); i++) {
            String movie = movieNames.get(i);
            if (searchedMovie.equals(movie)) {
                System.out.println("Found " + searchedMovie + " at index " + i);
                return i;
            }
        }
        System.out.println("Didn't find " + searchedMovie);
        return -1;
    }
}
