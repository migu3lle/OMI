package lection02;

import lection01.Brand;
import lection01.Vehicle;
import lection01.Workshop;

import java.util.ArrayList;

public class Car extends Vehicle {
    private double fuel;
    private double maxFuel;
    private double fuelConsumption;

    public Car(String name, Brand brand, ArrayList<Workshop> workshops, int weight, int maxPermissableWeight, double maxSpeed, double maxFuel, double fuelConsumption){
        super(name, brand, workshops, weight, maxPermissableWeight, maxSpeed);
        this.fuel = 0;
        this.maxFuel = maxFuel;
        this.fuelConsumption = fuelConsumption;
    }

    public void fillUp(double fuel){
        if(getFuel() + fuel < maxFuel)
            this.fuel += fuel;
        else
            this.fuel = maxFuel;
    }

    public void drive(int kilometers){
        double fuelNeeded = fuelConsumption * kilometers / 100;
        System.out.println("Fuel Needed for " + kilometers + " kilometers (" + fuelConsumption + "l / 100km): " + fuelNeeded + " Liters");

        if(fuelNeeded <= fuel) {
            fuel -= fuelNeeded;
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
        else {
            System.out.println("Treibstoff nach " + (fuel * fuelConsumption) / 100 + " Kilometer leer!");
            fuel = 0;
            //super.drive((int) (fuel * fuelConsumption / 100));
            /*f
            Lection 04 / exercise 3: abstract method drive()
             */
            for (int i = 0; i < (int) (fuel * fuelConsumption / 100); i++) {
                accelerate();
                accelerate();
                accelerate();
                brake();
                brake();
                brake();
            }
        }
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Car MaxFuel:                  " + maxFuel);
        System.out.println("Car Fuel Consumption:         " + fuelConsumption);
        System.out.println("Car Fuel Remaining:           " + fuel);
    }

    /*
    Getter / Setter
     */

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(double maxFuel) {
        this.maxFuel = maxFuel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
