package session6_core_API.practice;

public class ProductCodeComparasion {

    public static void main(String[] args) {
        String fiexedCode = "PROD12345";

        String code1 = new String("PROD12345");
        String code2 = "PROD12345";
        String code3 = "PROD" + "12345";
//        String code3 = "PROD";
//        code3 += "12345";

        System.out.println("Using == operator");

        System.out.println("fixedCode vs code1: " + (fiexedCode == code1)); // false
        System.out.println("fixedCode vs code2: " + (fiexedCode == code2)); // true
        System.out.println("fixedCode vs code3: " + (fiexedCode == code3)); // true

        System.out.println("Using equals()");
        System.out.println("fixedCode vs code1: " + (fiexedCode.equals(code1))); // true
        System.out.println("fixedCode vs code2: " + (fiexedCode.equals(code2))); // true
        System.out.println("fixedCode vs code3: " + (fiexedCode.equals(code3))); // true


    }
}
