package session11_abstraction.challenge.smart_home.devices;

import session11_abstraction.challenge.smart_home.Actuator;
import session11_abstraction.challenge.smart_home.Device;

public class AirConditioner extends Device {
    AirConditioner(){
        actuators.add(new Actuator() {
            @Override
            public void actuate(double TemperatureOffset) {
                if(TemperatureOffset<0){
                    System.out.println("Heaters cannot be used for cooling, use a HeaterInstead!");
                    return;
                }
                System.out.println("Changing temperature by: " + TemperatureOffset);
                // this temperature change would normally be picked up by the sensor, but in this demo,
                // there is no sensor, so I will be doing it by hand.
            }
        });
    }
}
