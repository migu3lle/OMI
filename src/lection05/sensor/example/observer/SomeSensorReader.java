package lection05.sensor.example.observer;

public class SomeSensorReader {

	SomeSensor sensor;

	public SomeSensorReader(SomeSensor sensor) {
		this.sensor = sensor;
		System.out.println("Start reading values...");
		
		Thread t = new Thread(new Reader());
		t.start();
	}

	
	// Read sensor values in a two seconds interval
	private class Reader implements Runnable {

		@Override
		public void run() {
			while (true) {
				System.out.println("SENSOR READER - Gelesener Sensorwert: " + sensor.getCurrentValue());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

}
