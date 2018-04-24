package lection05.smarthome.factory;

import at.omi.smarthome.interfaces.Actor;
import at.omi.smarthome.interfaces.Device;
import at.omi.smarthome.interfaces.Sensor;

public abstract class AbstractObjectFactory {
    abstract Actor getActor(String actorType);
    abstract Sensor getSensor(String sensorType);
}
