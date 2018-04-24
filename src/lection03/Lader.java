package lection03;

public interface Lader extends Baumaschine {
    static final double MAX_SCHAUFELVOLUMEN = 10;
    static final double MAX_KIPPHOEHE = 5;

    public double getSchaufelvolumen();
    public void setSchaufelvolumen(double schaufelvolumen);
    public double getKipphoehe();
    public void setKipphoehe(double kipphoehe);
    //public void druckeBeschreibung();

    /*
    For lection 04 / exercise 2/1 - Default methods
     */
    default void druckeBeschreibung(){
        System.out.println("Beschreibung für: " + this.getName() + ":");
        System.out.println("Leistung: " + this.getLeistung() + "\nGeschwindigkeit: " + this.getGeschwindigkeit()
                + "\nGewicht: "+ this.getGewicht() + "\nKipphöhe: " + this.getKipphoehe() + "\nSchaufelvolumen: " + this.getSchaufelvolumen() + "\n");
    }
}
