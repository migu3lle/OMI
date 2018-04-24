package lection02;

import lection01.Brand;
import lection01.Vehicle;
import lection01.Workshop;

import java.util.ArrayList;

public class ElectricCar extends Vehicle{

    private double batteryLevel;
    private double maxBatteryCapacity;
    private double powerConsumption;

    public ElectricCar(String name, Brand brand, ArrayList<Workshop> workshops, int weight, int maxPermissableWeight, int maxSpeed, double maxBatteryCapacity, double powerConsumption){
        super(name, brand, workshops, weight, maxPermissableWeight, maxSpeed);
        this.batteryLevel = 0;
        this.maxBatteryCapacity = maxBatteryCapacity;
        this.powerConsumption = powerConsumption;
    }

    public void charge(double power, double hours){
        if(power * hours > maxBatteryCapacity){
            batteryLevel = maxBatteryCapacity;
        }
        else{
            batteryLevel += power * hours;
        }
    }

    public void drive(int kilometers){
        double powerNeeded = kilometers * powerConsumption / 100;
        System.out.println("Power Needed for " + kilometers + " kilometers (" + powerConsumption + "kW/h): " + powerNeeded+ " kW");

        if(powerNeeded <= batteryLevel){
            batteryLevel -= powerNeeded;
            //super.drive(kilometers);
            /*
            Lection 04 / exercise 3: abstract method drive()
             */
            for (int i = 0; i < kilometers; i++) {
                accelerate();
                accelerate();
                accelerate();
                brake();
                brake();
                brake();
            }
        }
        else{
            System.out.println("Batterie nach " + (batteryLevel * powerConsumption) / 100 + " Kilometer leer!");
            batteryLevel = 0;
            //super.drive((int) (batteryLevel * powerConsumption/ 100));
                        /*
            Lection 04 / exercise 3: abstract method drive()
             */
            for (int i = 0; i < (batteryLevel * powerConsumption/ 100); i++) {
                accelerate();
                accelerate();
                accelerate();
                brake();
                brake();
                brake();
            }
        }
    }

    public double brake(){
        if(super.getSpeed() > 0){
            batteryLevel += 0.001;
        }
        return batteryLevel;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("El. Car Battery Level:        " + batteryLevel);
        System.out.println("El. Car Max Battery Capacity: " + maxBatteryCapacity);
        System.out.println("El. Car Power Consumption:    " + powerConsumption);
    }

    /*
    Getter / Setter
     */

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public double getMaxBatteryCapacity() {
        return maxBatteryCapacity;
    }

    public void setMaxBatteryCapacity(double maxBatteryCapacity) {
        this.maxBatteryCapacity = maxBatteryCapacity;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
