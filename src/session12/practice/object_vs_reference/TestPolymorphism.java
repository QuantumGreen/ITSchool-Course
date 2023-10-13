package session12.practice.object_vs_reference;

import java.util.Objects;

public class TestPolymorphism {

    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myTruck = new Truck();

        Car myCar2 = (Car)myCar;

        Object obj = myCar;
        Car car3 = (Car)obj;

        System.out.println(car3.fuelType());

        System.out.println(myCar.fuelType());
        System.out.println(myTruck.fuelType());
    }
}
