package lection01;

import lection02.Car;
import lection02.ElectricCar;

import java.util.ArrayList;

public class VehicleAdministration {

    private ArrayList<Vehicle> vehicles;

    public VehicleAdministration(){
        vehicles = new ArrayList<>();
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
