package lection03;

public abstract class BaumaschineImpl implements Baumaschine{

    private String name;
    private int leistung;
    private double geschwindigkeit;
    private double gewicht;

    public BaumaschineImpl(String name, int leistung, double geschwindigkeit, double gewicht){
        this.name = name;
        this.leistung = leistung;
        this.geschwindigkeit = geschwindigkeit;
        this.gewicht = gewicht;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getLeistung(){
        return this.leistung;
    }
    public void setLeistung(int leistung){
        this.leistung = leistung;
    }
    public double getGeschwindigkeit(){
        return geschwindigkeit;
    }
    public void setGeschwindigkeit(double geschwindigkeit){
        this.geschwindigkeit = geschwindigkeit;
    }
    public double getGewicht(){
        return gewicht;
    }
    public void setGewicht(double gewicht){
        this.gewicht = gewicht;
    }
    public void druckeBeschreibung(){
        System.out.println("Beschreibung von " + name + ":");
        System.out.println("Leistung: " + leistung+ "\nGeschwindigkeit: " + geschwindigkeit + "\nGewicht: " + gewicht + "\n");
    }

}
