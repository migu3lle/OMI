package lection05.sensor.example.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SomeSensor {

	private long currentValue;

	/*
	For Observer Pattern implementation
	 */
	private List<AbstractObserver> observers = new ArrayList<>();
	//Fügt Obervers hinzu
	public void attach(AbstractObserver observer){
		observers.add(observer);
	}
	private void notifyObservers(){
		for(AbstractObserver observer : observers){
			observer.update(currentValue);
		}
	}


	public SomeSensor() {
		System.out.println("Initializing sensor...");
		currentValue = -1;
		Thread t = new Thread(new ValueGenerator());
		t.start();
	}

	
	// simulate dynamic change of sensor values
	private class ValueGenerator implements Runnable {

		@Override
		public void run() {
			while (true) {

				System.out.println("SENSOR - �ndere Wert auf: "+getCurrentValue());
				setCurrentValue(new Random().nextLong());
				notifyObservers();

				long timeToSleep = new Random().nextInt(12);
				try {
					Thread.sleep(timeToSleep * 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}

	public long getCurrentValue() {
		return currentValue;
	}

	private void setCurrentValue(long currentValue) {
		this.currentValue = currentValue;
	}

}
