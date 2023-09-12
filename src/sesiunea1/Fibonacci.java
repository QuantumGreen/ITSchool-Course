package sesiunea1;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < 100; i++) {
            int Bn = b + a;
            a = b;
            b = Bn;
            System.out.print(a + " ");
        }
    }
}
