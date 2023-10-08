package session11_abstraction.challenge.smart_home.devices;

import session11_abstraction.challenge.smart_home.Device;
import session11_abstraction.challenge.smart_home.Sensor;

public class Thermostat extends Device {
    public double temperature;

    Thermostat(){
        sensors.add(new Sensor() {
            @Override
            public double sendData() {
                return temperature;
            }
        });
    }
}
