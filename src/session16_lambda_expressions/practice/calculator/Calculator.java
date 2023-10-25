package session16_lambda_expressions.practice.calculator;

@FunctionalInterface
public interface Calculator {
    double calculate(double a, double b, char operator);
}
