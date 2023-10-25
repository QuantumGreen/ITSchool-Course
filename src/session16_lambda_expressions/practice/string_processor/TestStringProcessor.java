package session16_lambda_expressions.practice.string_processor;

public class TestStringProcessor {

    public static void main(String[] args) {
        StringProcessor removeWhiteSpaces = input -> input.replace(" ","");
        StringProcessor toUppercase = input -> input.toUpperCase();


        StringProcessor result = removeWhiteSpaces.andThen(toUppercase);
        System.out.println(result.process("some - du d e"));

    }
}
