package session11_abstraction.challenge.smart_home;

import java.util.List;

/**
 * this is the brains of the operation
 * takes care of everything
 */
public class Hal9000 {
    private List<Device> devices;
//    private List<Actuator> actuators;
//    private List<Sensor> sensors;

    public void addDevice(User user, Device device) {
        if (user.level == UserLevel.HOME_OWNER) {
            devices.add(device);
        }
    }

    public boolean removeDevice(User user, Device device) {
        if (user.level == UserLevel.HOME_OWNER) {
            return devices.remove(device);
        }
        return false;
    }
}
