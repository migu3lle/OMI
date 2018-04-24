package lection03;

public class BaggerImpl extends BaumaschineImpl implements Bagger {
    private double reichweite;
    private double grabtiefe;

    //Konstruktor
    public BaggerImpl(String name, int leistung, double geschwindigkeit, double gewicht, double grabtiefe, double reichweite){
        super(name, leistung, geschwindigkeit, gewicht);

        if(grabtiefe > Bagger.MAX_GRABTIEFE)
            System.err.println("ACHTUNG: Max. erlaubte Grabtiefe: " + Bagger.MAX_GRABTIEFE);
        else
            this.grabtiefe = grabtiefe;
        if(reichweite > Bagger.MAX_REICHWEITE)
            System.err.println("ACHTUNG: Max. erlaubte Reichweite: " + Bagger.MAX_REICHWEITE);
        else
            this.reichweite = reichweite;
    }

    @Override
    public double getGrabtiefe() {
        return grabtiefe;
    }

    @Override
    public void setGrabtiefe(double grabtiefe) {
        if(grabtiefe > Bagger.MAX_GRABTIEFE)
            System.err.println("ACHTUNG: Max. erlaubte Grabtiefe: " + Bagger.MAX_GRABTIEFE);
        else
            this.grabtiefe = grabtiefe;
    }

    @Override
    public double getReichweite() {
        return reichweite;
    }

    @Override
    public void setReichweite(double reichweite) {
        if(reichweite > Bagger.MAX_REICHWEITE)
            System.err.println("ACHTUNG: Max. erlaubte Reichweite: " + Bagger.MAX_REICHWEITE);
        else
            this.reichweite = reichweite;
    }

    @Override
    public void druckeBeschreibung() {
        System.out.println("Beschreibung von " + this.getName() + ": ");
        System.out.println("Leistung: " + this.getLeistung() + "\nGeschwindigkeit: " + this.getGeschwindigkeit()
                + "\nGewicht: "+ this.getGewicht() + "\nGrabtiefe: " + grabtiefe + "\nReichweite: " + reichweite + "\n");
    }
}
