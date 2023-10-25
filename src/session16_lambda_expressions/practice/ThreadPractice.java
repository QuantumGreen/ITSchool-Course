package session16_lambda_expressions.practice;

public class ThreadPractice {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("A new thread has started");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
