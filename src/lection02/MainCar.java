package lection02;

import lection01.Brand;
import lection01.Workshop;

import java.util.ArrayList;

public class MainCar {
    public static void main(String[] args) {

        /*
        Aufgabe 2
         */
        System.out.println("\n------- Aufgabe 2 -------\n");

        Brand brand1 = new Brand("Volvo", "NL", "1234", "brand1@mail");
        Brand brand2 = new Brand("Mazda", "DE", "5678", "brand2@mail");
        Brand brand3 = new Brand("Citroen", "US", "00103", "brand3@mail");

        Workshop work1 = new Workshop("workshop1", "AT", 1030, "Vienna", "Landstraße 4", "445566");
        Workshop work2 = new Workshop("workshop2", "AT", 9020, "Klagenfurt", "Herrengasse 4", "996643");
        Workshop work3 = new Workshop("workshop3", "AT", 3910, "Zwettl", "Braustraße 8", "112222");

        ArrayList<Workshop> workList = new ArrayList<>();
        workList.add(work1);
        workList.add(work2);
        workList.add(work3);


        Car car1 = new Car("car1", brand1, workList, 800, 1200, 90, 50, 5);
        Car car2 = new Car("car2", brand2, workList, 910, 1200, 140, 50, 10);
        Car car3 = new Car("car3", brand3, workList, 1050, 1200, 210, 100, 15);

        car1.fillUp(7);
        System.out.println("Fuel: " + car1.getFuel() + " Liters");
        car1.drive(100);
        car1.printInfo();

        /*
        Aufgabe 2
         */
        System.out.println("\n------- Aufgabe 3 -------\n");

        ElectricCar elCar1 = new ElectricCar("Elektro1", brand1, workList, 1300, 1400, 180, 7000, 70);
        ElectricCar elCar2 = new ElectricCar("Elektro2", brand1, workList, 1300, 1400, 180, 10000, 90);


        elCar1.charge(100, 0.5);
        System.out.println("Car charged 30mins with 100W --> initial battery level :" + elCar1.getBatteryLevel() + " kW.");
        System.out.println("Drive 40 kilometers.");
        elCar1.drive(40);
        System.out.println("Battery Remaining: " + elCar1.getBatteryLevel() + " kW.");

        System.out.println("\nDrive 100 kilometers.");
        elCar1.drive(100);
        System.out.println("Battery Remaining: " + elCar1.getBatteryLevel() + " kW.");

    }
}
