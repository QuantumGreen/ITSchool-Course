package session11_abstraction.challenge.smart_home;

import java.util.List;

public class Device {

    public String name;
    public List<Actuator> actuators;
    public List<Sensor> sensors;

    public String area;
    public boolean isCommon;
}
