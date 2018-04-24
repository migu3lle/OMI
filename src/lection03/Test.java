package lection03;

public class Test {
    public static void main(String[] args) {
        Baumaschine baggerlader = new BaggerladerImpl("Baggerlader 1", 250, 70, 2700, 3.3, 4, 3.6, 6);
        baggerlader.druckeBeschreibung();

        Baumaschine bagger = new BaggerImpl("Bagger 1", 210, 65, 3200, 4.2, 7.1);
        bagger.druckeBeschreibung();

        Baumaschine lader = new LaderImpl("Lader 1", 190, 90, 2200, 2.5, 3);
        lader.druckeBeschreibung();
    }

}
