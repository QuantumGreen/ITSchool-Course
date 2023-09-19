package session4_boolean_algebra.practice;

public class TernaryOperatorPractice {
    public static void main(String[] args) {
        int number = -3;
//        String resultini = (number>0) ? "positive" : "zero or negative";
        String result = (number>0) ? "positive" : (number==0) ? "zero" : "negative";
        System.out.println("the number is " + result);
    }
}
