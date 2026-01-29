package oop.abstract1.schritt3;

public class Main {
    public static void main(String[] args) {
        Auto bmw = new Auto("BMW");
        Fahrrad cupe = new Fahrrad("Cupe");

        bmw.info();
        cupe.info();
    }
}

abstract class Fahrzeug {
    protected String marke;

    public Fahrzeug(String marke) {
        this.marke = marke;
    }

    public abstract void info();
}

class Auto extends Fahrzeug {
    public Auto(String marke) {
        super(marke);
    }
    public void info() {
        System.out.println("Auto: " + marke);
    }
}

class Fahrrad extends Fahrzeug {
    public Fahrrad(String marke) {
        super(marke);
    }
    public void info() {
        System.out.println("Fahrrad: " + marke);
    }
}
