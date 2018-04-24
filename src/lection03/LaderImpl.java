package lection03;

public class LaderImpl extends BaumaschineImpl implements Lader {
    private double kipphoehe;
    private double schaufelvolumen;

    public LaderImpl(String name, int leistung, double geschwindigkeit, double gewicht, double kipphoehe, double schaufelvolumen){
        super(name, leistung, geschwindigkeit, gewicht);
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
        System.out.println("Beschreibung für: " + this.getName() + ":");
        System.out.println("Leistung: " + this.getLeistung() + "\nGeschwindigkeit: " + this.getGeschwindigkeit()
                + "\nGewicht: "+ this.getGewicht() + "\nKipphöhe: " + kipphoehe + "\nSchaufelvolumen: " + schaufelvolumen + "\n");
    }
}
