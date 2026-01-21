package oop.firstclass;

public class Auto {
    String marke;
    String farbe;

    public Auto(String marke, String farbe) {
        this.farbe = farbe;
        this.marke = marke;
    }

    public void fahren() {
        System.out.println("Das Auto Fährt");
    }
}
