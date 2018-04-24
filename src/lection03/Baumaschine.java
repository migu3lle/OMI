package lection03;

public interface Baumaschine {
    public String getName();
    public void setName(String name);
    public int getLeistung();
    public void setLeistung(int leistung);
    public double getGeschwindigkeit();
    public void setGeschwindigkeit(double geschwindigkeit);
    public double getGewicht();
    public void setGewicht(double gewicht);
    public void druckeBeschreibung();
}
