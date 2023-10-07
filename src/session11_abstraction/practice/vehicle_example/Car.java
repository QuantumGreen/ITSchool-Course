package session11_abstraction.practice.vehicle_example;

public class Car extends Vehicle implements Refuelable {
    @Override
    public void refuel() {

    }

    @Override
    void accelerate() {
        //abstract
    }

    @Override
    void brake() {
        //from abstract classe
    }
}
