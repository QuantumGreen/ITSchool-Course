package session11_abstraction.challenge.challenge6;

public class Main {

    public static void main(String[] args) {
        Area area = new Area();
        System.out.println(area.rectangleArea(2, 3)); // expect 6
        System.out.println(area.squareArea(4)); // expect 16
        System.out.println(area.circleArea(1 / Math.sqrt(Math.PI))); // expect 1
    }
}
