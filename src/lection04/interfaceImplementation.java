package lection04;

import lection03.Bagger;
import lection03.BaggerImpl;
import lection03.Lader;

public class interfaceImplementation extends BaggerImpl implements Bagger, Lader{

    /*
    Problem: There is no default constructor available in BaggerImpl
    */
    public interfaceImplementation(String name, int leistung, double geschwindigkeit, double gewicht, double grabtiefe, double reichweite) {
        super(name, leistung, geschwindigkeit, gewicht, grabtiefe, reichweite);
    }

    /*
    To solve the multiple inheritance problem: Override method but call default method by super keyword
     */
    @Override
    public void druckeBeschreibung() {
        Lader.super.druckeBeschreibung();
    }


    @Override
    public double getGrabtiefe() {
        return 0;
    }

    @Override
    public void setGrabtiefe(double grabtiefe) {

    }

    @Override
    public double getReichweite() {
        return 0;
    }

    @Override
    public void setReichweite(double reichweite) {

    }

    @Override
    public double getSchaufelvolumen() {
        return 0;
    }

    @Override
    public void setSchaufelvolumen(double schaufelvolumen) {

    }

    @Override
    public double getKipphoehe() {
        return 0;
    }

    @Override
    public void setKipphoehe(double kipphoehe) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getLeistung() {
        return 0;
    }

    @Override
    public void setLeistung(int leistung) {

    }

    @Override
    public double getGeschwindigkeit() {
        return 0;
    }

    @Override
    public void setGeschwindigkeit(double geschwindigkeit) {

    }

    @Override
    public double getGewicht() {
        return 0;
    }

    @Override
    public void setGewicht(double gewicht) {

    }
}
