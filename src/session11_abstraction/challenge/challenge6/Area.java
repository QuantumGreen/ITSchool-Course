package session11_abstraction.challenge.challenge6;

public class Area extends Shape {
    @Override
    public double rectangleArea(double width, double height) {
        return width * height;
    }

    @Override
    public double squareArea(double sideLength) {
        return sideLength * sideLength;
    }

    @Override
    public double circleArea(double radius) {
        return radius * radius * Math.PI;
    }
}
