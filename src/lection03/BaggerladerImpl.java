package lection03;

public class BaggerladerImpl extends BaggerImpl implements Baggerlader {

    private double kipphoehe;
    private double schaufelvolumen;

    public BaggerladerImpl(String name, int leistung, double geschwindigkeit, double gewicht, double kipphoehe, double schaufelvolumen, double grabtiefe, double reichweite){
        super(name, leistung, geschwindigkeit, gewicht, grabtiefe, reichweite);
        if(kipphoehe > Lader.MAX_KIPPHOEHE)
            System.out.println("ACHTUNG: Max. erlaubte Kipphöhe: " + Lader.MAX_KIPPHOEHE);
        else
            this.kipphoehe = kipphoehe;
        if(schaufelvolumen > Lader.MAX_SCHAUFELVOLUMEN)
            System.out.println("ACHTUNG: Max. erlaubtes Schaufelvolumen: " + Lader.MAX_SCHAUFELVOLUMEN);
        else
            this.schaufelvolumen = schaufelvolumen;
    }

    @Override
    public double getSchaufelvolumen() {
        return schaufelvolumen;
    }

    @Override
    public void setSchaufelvolumen(double schaufelvolumen) {
        if(schaufelvolumen > Lader.MAX_SCHAUFELVOLUMEN)
            System.out.println("ACHTUNG: Max. erlaubtes Schaufelvolumen: " + Lader.MAX_SCHAUFELVOLUMEN);
        else
            this.schaufelvolumen = schaufelvolumen;
    }

    @Override
    public double getKipphoehe() {
        return kipphoehe;
    }

    @Override
    public void setKipphoehe(double kipphoehe) {
        if(kipphoehe > Lader.MAX_KIPPHOEHE)
            System.out.println("ACHTUNG: Max. erlaubte Kipphöhe: " + Lader.MAX_KIPPHOEHE);
        else
            this.kipphoehe = kipphoehe;
    }

    @Override
    public void druckeBeschreibung() {
        System.out.println("Beschreibung von " + this.getName() + ": ");
        System.out.println("Leistung: " + this.getLeistung() + "\nGeschwindigkeit: " + this.getGeschwindigkeit()
                + "\nGewicht: "+ this.getGewicht() + "\nKipphöhe: " + kipphoehe + "\nSchaufelvolumen: "
                + schaufelvolumen + "\nGrabtiefe: " + this.getGrabtiefe() + "\nReichweite: " + this.getReichweite() + "\n");
    }

}
