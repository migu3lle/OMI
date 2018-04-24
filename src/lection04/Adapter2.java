package lection04;

import at.omi.smarthome.interfaces.Actor;
import at.omi.smarthome.simulation2.SimulatedLight2;

public class Adapter2 extends SimulatedLight2 implements Actor {

    private String id;

    @Override
    public void switchOn() {
        set(1);
    }

    @Override
    public void switchOff() {
        set(0);
    }

    @Override
    public void setId(String s) {
        this.id = s;
    }

    @Override
    public String getId() {
        return id;
    }
}
