package oop.vererbung;

public class Fahrzeug {
    protected String marke;
    protected String farbe;

    public Fahrzeug(String marke, String farbe) {
        this.marke = marke;
        this.farbe = farbe;
    }

    public void info() {
        System.out.println("Auto: " + marke + ", farbe: " + farbe);
    }

    public void starten() {
        System.out.println(marke + ", startet den Motor...");
    }
}
