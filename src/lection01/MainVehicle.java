package lection01;

import lection02.Car;
import lection02.ElectricCar;

import java.util.ArrayList;

public class MainVehicle {
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

        Vehicle v1 = new Car(/*1,*/ "Auto1", brand1, workList, 1200, 1600, 170, 50, 10);
        Vehicle v2 = new Car(/*2,*/ "Auto2", brand2, workList, 1000, 1400, 160,50, 10);
        Vehicle v3 = new Car(/*3,*/ "Auto3", brand3, workList, 1400, 2000, 220, 50, 10);

        v1.drive(72);
        v1.drive(315);
        v1.drive(21);

        System.out.println("++ Vehicle 1 ++");
        v1.printInfo();
        System.out.println("++ Vehicle 2 ++");
        v2.printInfo();
        System.out.println("++ Vehicle 3 ++");
        v3.printInfo();

        /*
        Aufgabe 3
         */
        System.out.println("\n------- Aufgabe 3 -------\n");

        VehicleAdministration vehadm = new VehicleAdministration();
        vehadm.AddVehicle(v1);
        vehadm.AddVehicle(v2);
        vehadm.AddVehicle(v3);

        System.out.println("++ Found vehicle: ++");
        vehadm.search(v2.getId());

        System.out.println("++ All vehicles: ++");
        vehadm.printAllVehicles();

        //Remove one from list
        vehadm.removeVehicle(v2.getId());

        System.out.println("\n++ Found vehicle: ++");
        vehadm.search(v2.getId());

        System.out.println("++ All vehicles: ++");
        vehadm.printAllVehicles();

        /*
        Aufgabe 4
         */
        System.out.println("\n------- Aufgabe 4 -------\n");

        vehadm.AddVehicle(v2);
        Vehicle v4 = new Car(/*1,*/ "Auto4", brand1, workList, 1200, 1600, 170, 50, 10);
        Vehicle v5 = new Car(/*2,*/ "Auto5", brand2, workList, 1000, 1400, 160, 50, 10);
        Vehicle v6 = new Car(/*3,*/ "Auto6", brand3, workList, 1400, 2000, 220, 50, 10);



        vehadm.AddVehicle(v4);

        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(v5);
        vehicleList.add(v6);

        /*
        Create Electric Car and Car for Lection 02 exercise 05
         */
        Vehicle v9 = new ElectricCar("Elektro1", brand1, workList, 1300, 1400, 180, 7000, 70);
        Vehicle v10 = new Car("car1", brand1, workList, 800, 1200, 90, 50, 5);
        vehicleList.add(v9);
        vehicleList.add(v10);

        vehadm.AddVehicle(vehicleList);

        vehadm.printAllVehicles();

        System.out.println("\n++ Find Brands: ++");
        vehadm.search("Mazda");

    }
}
