package lection01;

import java.util.ArrayList;

public abstract class Vehicle {
    private int id;
    private String name;
    private Brand brand;
    private ArrayList<Workshop> workshops;
    private int weight;
    private int maxPermissableWeight;
    private double speed;
    private double maxSpeed;
    private static long nextID = 0;

    public Vehicle(/*int id,*/ String name, Brand brand, ArrayList<Workshop> workshops, int weight, int maxPermissableWeight, double maxSpeed){
        //this.id = id; //Not used in Aufgabe 4
        this.id = (int) getNextID();
        this.name = name;
        this.brand = brand;
        this.workshops = workshops;
        this.weight = weight;
        this.maxPermissableWeight = maxPermissableWeight;
        this.speed = 0;
        this.maxSpeed = maxSpeed;
    }

    private static long getNextID(){
        return ++nextID;
    }

    public double accelerate(){
        if(speed < maxSpeed-10)
            speed += 10;
        else
            speed = maxSpeed;
        return speed;
    }

    public double brake(){
        if(speed > 10)
            speed -= 10;
        else
            speed = 0;
        return speed;
    }

    /* For lection 04 / exercise 3/1: make drive() abstract
    public void drive(int kilometers){
        for (int i = 0; i < kilometers; i++) {
            accelerate();
            accelerate();
            accelerate();
            brake();
            brake();
            brake();
        }
    }*/
    public abstract void drive(int kilometers);     //Abstract method


    public void printInfo(){
        System.out.println("Vehicle ID:                   " + id);
        System.out.println("Vehicle Name:                 " + name);
        System.out.println("Vehicle Brand:                " + brand.getName());
        System.out.print("Vehicle Workshops:            " );
        for (Workshop w : workshops) {
            System.out.print(w.getName() + " " + w.getPostcode() + ", ");
        }
        System.out.println();
        System.out.println("Vehicle Weight:               " + weight);
        System.out.println("Vehicle MaxPermissableWeight: " + weight);
        System.out.println("Vehicle Speed:                " + speed);
        System.out.println("Vehicle MaxSpeed:             " + maxSpeed);
    }

    public Workshop getWorkshop(int postcode){
        Workshop ws = null;
        for (Workshop w : workshops) {
            if(w.getPostcode() == postcode){
                ws = w;
            }
        }
        return ws;
    }


    /*
    Getter, Setter...
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public ArrayList<Workshop> getWorkshops() {
        return workshops;
    }

    public void setWorkshops(ArrayList<Workshop> workshops) {
        this.workshops = workshops;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxPermissableWeight() {
        return maxPermissableWeight;
    }

    public void setMaxPermissableWeight(int maxPermissableWeight) {
        this.maxPermissableWeight = maxPermissableWeight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
