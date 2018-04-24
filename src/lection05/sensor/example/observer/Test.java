package lection05.sensor.example.observer;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SomeSensor someSensor = new SomeSensor();
		SomeSensorReader someSensorReader = new SomeSensorReader(someSensor);
		new SensorObserver(someSensor);
	}
	

}
