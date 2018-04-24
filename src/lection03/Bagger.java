package lection03;

public interface Bagger extends Baumaschine{
    static final double MAX_GRABTIEFE = 15d;
    static final double MAX_REICHWEITE = 18d;

    public double getGrabtiefe();
    public void setGrabtiefe(double grabtiefe);
    public double getReichweite();
    public void setReichweite(double reichweite);
    //public void druckeBeschreibung();

    /*
    For lection 04 / exercise 2/1 - Default methods
     */
    default void druckeBeschreibung(){
        System.out.println("Beschreibung von " + this.getName() + ": ");
        System.out.println("Leistung: " + this.getLeistung() + "\nGeschwindigkeit: " + this.getGeschwindigkeit()
                + "\nGewicht: "+ this.getGewicht() + "\nGrabtiefe: " + this.getGrabtiefe() + "\nReichweite: " + this.getReichweite() + "\n");
    }
}

