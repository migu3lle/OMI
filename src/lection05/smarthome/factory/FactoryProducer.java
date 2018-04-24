package lection05.smarthome.factory;

public class FactoryProducer {
    public static AbstractObjectFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("ACTOR")){
            return new ActorFactory();
        }
        else if(choice.equalsIgnoreCase("SENSOR")) {
            return new SensorFactory();
        }
        return null;
    }
}
