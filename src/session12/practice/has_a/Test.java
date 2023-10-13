package session12.practice.has_a;

public class Test {

    public static void main(String[] args) {
        // has-a : composition
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.start();
        car.drive();
    }
}
