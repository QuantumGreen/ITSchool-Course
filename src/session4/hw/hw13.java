package session4.hw;

// 13. Write a Java program where you declare two boolean variables isRaining and isSunny with values of true and false, respectively. Use the logical complement operator to negate the values of both variables and print the new values.


public class hw13 {
    public static void main(String[] args) {
        boolean isSunny = false;
        boolean isRainy = true;

        isSunny = !isSunny;
        isRainy = !isRainy;

        System.out.println(isSunny);
        System.out.println(isRainy);

    }
}
