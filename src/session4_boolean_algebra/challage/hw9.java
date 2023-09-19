package session4_boolean_algebra.challage;

// 9. Write a Java program to create two String variables, countryOne with the value "USA" and countryTwo with the value "USA". Check if countryOne and countryTwo are equal using the equals() method and print the result. Then change the value of countryTwo to "UK" and check for equality again. Print the result.


public class hw9 {
    public static void main(String[] args) {
        String countryOne = "USA";
        String countryTwo = "USA";
        System.out.println(countryOne.equals(countryTwo));
        countryTwo = "UK";
        System.out.println(countryOne.equals(countryTwo));
    }
}
