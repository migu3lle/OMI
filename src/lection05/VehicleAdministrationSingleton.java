package lection05;

import lection01.Vehicle;
import lection02.Car;
import lection02.ElectricCar;

import java.util.ArrayList;

public class VehicleAdministrationSingleton {

    /*
    Excercise 2 - Singleton
    Für Car wäre ein Singleton nicht sinnvoll, da es mehrere Objekte vom Typ Car geben können soll
     */

    //Static variable ob Object itself
    private static VehicleAdministrationSingleton singleton;

    private static ArrayList<Vehicle> vehicles;

    private VehicleAdministrationSingleton(){
        //Private Constructor to prevent from instantiation
        vehicles = new ArrayList<>();
    }

    public static VehicleAdministrationSingleton getInstance(){
        if(singleton == null){
            singleton = new VehicleAdministrationSingleton();
        }
        return singleton;
    }



    public void AddVehicle(Vehicle vehicle){
        boolean exists = false;
        for (Vehicle v : vehicles) {
            if(v.getId() == vehicle.getId())
                exists = true;
        }
        if(!exists)
            vehicles.add(vehicle);
    }

    //Overload with ArrayList of Vehicles
    public void AddVehicle(ArrayList<Vehicle> vehicleList){
        for (Vehicle v : vehicleList) {
            AddVehicle(v);
        }
    }


    public void removeVehicle(int vehicleId){
        for (Vehicle v : vehicles) {
            if(v.getId() == vehicleId)
                vehicles.remove(v);
        }
    }

    public void search(int vehicleId){
        for (Vehicle v : vehicles) {
            if(v.getId() == vehicleId)
                v.printInfo();
        }
    }

    public void search(String brandName){
        for (Vehicle v : vehicles) {
            if(v.getBrand().getName().equals(brandName))
                v.printInfo();
        }
    }

    public void printAllVehicles(){
        for (Vehicle v : vehicles) {
            v.printInfo();
        }
    }

    /*
    Methods for Übungsblatt 02 / Exercise 04
     */
    public void fillUpAllCars(double fuel){
        for (Vehicle v : vehicles){
            if(v instanceof Car){
                Car c = (Car) v;
                c.fillUp(fuel);
            }
        }
    }

    public void chargeAllElectricCars(double power, double hours){
        for (Vehicle v : vehicles) {
            if(v instanceof ElectricCar){
                ElectricCar e = (ElectricCar) v;
                e.charge(power, hours);
            }
        }
    }
}
