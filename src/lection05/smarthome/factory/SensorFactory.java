package lection05.smarthome.factory;

import at.omi.smarthome.interfaces.Actor;
import at.omi.smarthome.interfaces.Device;
import at.omi.smarthome.interfaces.Sensor;

public class SensorFactory extends AbstractObjectFactory {

    @Override
    Sensor getSensor(String sensorType) {
        if(sensorType == null){
            return null;
        }
        else if(sensorType.equalsIgnoreCase("SensorImpl")){
            return new SensorImpl();
        }
        return null;
    }

    @Override
    Actor getActor(String actorType) {
        return null;
    }
}
