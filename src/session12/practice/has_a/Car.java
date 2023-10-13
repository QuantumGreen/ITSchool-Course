package session12.practice.has_a;

public class Car {

    Engine engine; // using composition, Car HAS-A Engine

    public Car(Engine engine) {
        this.engine = engine;
    }

    void start() {
        engine.Start();
    }
    void drive() {
        System.out.println("Car is driving");
    }
}
