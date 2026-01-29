package oop.abstract1.schritt2;

public class Main {
    public static void main(String[] args) {
        
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
        System.out.println("Fahrrad " + marke);
    }
}
