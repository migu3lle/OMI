package lection05.smarthome.factory;

import at.omi.smarthome.interfaces.Actor;
import at.omi.smarthome.interfaces.Device;
import at.omi.smarthome.interfaces.Sensor;

public class ActorFactory extends AbstractObjectFactory {

    @Override
    public Actor getActor(String actorType){
        if(actorType == null){
            return null;
        }
        if(actorType.equalsIgnoreCase("SimulatedLight1Adapter")){
            return new SimulatedLight1Adapter();
        }
        else if(actorType.equalsIgnoreCase("SimulatedLight2Adapter")){
            return new SimulatedLight2Adapter();
        }
        return null;
    }

    @Override
    Sensor getSensor(String sensorType) {
        return null;
    }
}
