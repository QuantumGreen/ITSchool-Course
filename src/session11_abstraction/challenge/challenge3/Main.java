package session11_abstraction.challenge.challenge3;

public class Main {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(1,2,3);
        StudentB studentB = new StudentB(1,2,3,4);

        System.out.println(studentA.getPercentage());
        System.out.println(studentB.getPercentage());
    }
}
