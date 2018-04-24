package lection05.sensor.example.observer;

public abstract class AbstractObserver {
    public SomeSensor sensor;
    public abstract void update(long currentValue);
}
