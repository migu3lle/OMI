package lection05.sensor.example.observer;

public class SensorObserver extends AbstractObserver{

    /*
    Füge sich selbst im Konstruktor zu der Observer-Liste des Sensors hinzu.
     */
    public SensorObserver(SomeSensor sensor){
        this.sensor = sensor;
        this.sensor.attach(this);
    }

    @Override
    public void update(long currentValue) {
        System.out.println("OBSERVER: Neuer Wert erhalten: " + this.sensor.getCurrentValue());
    }
}
