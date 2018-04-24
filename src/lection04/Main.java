package lection04;

import java.awt.EventQueue;
import java.util.ArrayList;

import at.omi.smarthome.gui.SmarthomeGUI;
import at.omi.smarthome.interfaces.Actor;
import at.omi.smarthome.interfaces.Device;
import at.omi.smarthome.simulation1.SimulatedLight1;
import at.omi.smarthome.simulation2.SimulatedLight2;

public class Main {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					//SimulatedLight1 sl1 = new SimulatedLight1();
					//SimulatedLight2 sl2 = new SimulatedLight2();
					
					ArrayList<Device> devices = new ArrayList<Device>();

					Actor actor1 = new Adapter1();
					actor1.setId("1111");
					actor1.setName("Lampe Wohnzimmer");

					Actor actor2 = new Adapter2();
					actor2.setId("22222");
					actor2.setName("Licht Bad");

					devices.add(actor1);
					devices.add(actor2);

					SmarthomeGUI smarthome = new SmarthomeGUI(devices);	
					smarthome.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
