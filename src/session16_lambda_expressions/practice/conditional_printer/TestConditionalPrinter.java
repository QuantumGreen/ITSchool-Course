package session16_lambda_expressions.practice.conditional_printer;

public class TestConditionalPrinter {

    public static void main(String[] args) {
        ConditionalPrinter conditionalPrinter = (str, bool) -> {
            printIf(str, bool);
        };
        conditionalPrinter.print("some stuff",true);
        conditionalPrinter.print("some stuff",false);
    }

    private static void printIf(String str, boolean bool) {
        if (bool){
            System.out.println(str);
        }
    }
}
