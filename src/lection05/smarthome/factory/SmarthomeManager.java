package lection05.smarthome.factory;

import java.util.ArrayList;

import at.omi.smarthome.interfaces.Actor;
import at.omi.smarthome.interfaces.Device;
import at.omi.smarthome.interfaces.Sensor;

/**
 * Manager class providing group functions for created devices
 * @author Sheldon Cooper
 *
 */
public class SmarthomeManager {
	

	private ArrayList<Device> devices;
	private FactoryProducer producer;

	public SmarthomeManager(){
		devices = new ArrayList<Device>();
		producer = new FactoryProducer();
	}
	
	/**
	 * Creates a new device instance (actor, sensor, etc.) indentified by model, tests it and adds it to the list of managed devices
	 * @param id - The id of the device to create
	 * @param name - The name of the device to create
	 * @param model - The model identifier to select the specific implementation class
	 */
	public void addDevice(String id, String name, String model){
			Device tempDevice=null;
		
			if(model.equals("A1")){
				tempDevice = producer.getFactory("Actor").getActor("SimulatedLight1Adapter");
			}
			else if(model.equals("A2")){
				tempDevice = producer.getFactory("Actor").getActor("SimulatedLight2Adapter");
			}
			else if(model.equals("S1")){
				tempDevice = producer.getFactory("Sensor").getSensor("SensorImpl");
				((Sensor)tempDevice).setUnit("SomeUnit");
			}
			
			if(tempDevice != null){
				tempDevice.setId(id);
				tempDevice.setName(name);
				devices.add(tempDevice);
				testDevice(tempDevice);
			
			}
			else{
				System.out.println("Unknown device model: "+model);
			}
			
	}
	
	/**
	 * Switch available actors on
	 */
	public void switchActorsOn(){
		for(Device currentDevice:devices){
			if(currentDevice instanceof Actor){
				System.out.println("Switching "+currentDevice.getId()+", "+currentDevice.getName()+" to ON");
				((Actor) currentDevice).switchOn();
			}
		}
	}
	
	/**
	 * Switch available actors off
	 */
	public void switchActorsOff(){
		for(Device currentDevice:devices){
			if(currentDevice instanceof Actor){
				System.out.println("Switching "+currentDevice.getId()+", "+currentDevice.getName()+" to OFF");
				((Actor) currentDevice).switchOff();
			}
		}
	}
	
	/**
	 * Print readings of available sensors
	 */
	public void printSensorReadings() {
		System.out.println("---------- SENSOR READINGS ----------");
		for(Device currentDevice:devices){
			if(currentDevice instanceof Sensor){
				System.out.println("Sensor: "+currentDevice.getId()+", "+currentDevice.getName()+", "+((Sensor)currentDevice).getUnit()+": "+((Sensor)currentDevice).getValue());
			}
		}
	}
	
	/**
	 * Test functionality of a given device
	 * @param device
	 */
	private void testDevice(Device device){
		if(device instanceof Actor){
			((Actor)device).switchOn();
			
			try {
				// Yes, yes - quick and dirty!!!
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			((Actor)device).switchOff();
		}
		else if (device instanceof Sensor){
			System.out.println("Sensor: "+device.getId()+", "+device.getName()+", "+((Sensor)device).getUnit()+": "+((Sensor)device).getValue());
		}
	}

}
