package oop.vererbung2.schritt3;

public class Main {
    public static void main(String[] args) {
        VerbrennerAuto verbAu = new VerbrennerAuto("BMW", "schwarz");
        verbAu.info();

        EAuto eAuto = new EAuto("Tesla", "weiß");
        eAuto.info();
    }
}

class Fahrzeug {
    private String marke;
    private String farbe;

    Fahrzeug(String marke, String farbe) {
        this.marke = marke;
        this.farbe = farbe;
    }

    public String getMarke() {
        return marke;
    }

    public String getFarbe() {
        return farbe;
    }

    void info() {
        System.out.println("Auto: " + marke);
        System.out.println("Farbe: " + farbe);
    }

}

class VerbrennerAuto extends Fahrzeug {
    VerbrennerAuto(String marke, String farbe) {
        super(marke, farbe);
    }
    void info() {
        System.out.println("Verbrenner: " + getMarke());
        System.out.println("Farbe: " + getFarbe());
    }
}

class EAuto extends Fahrzeug {
    EAuto(String marke, String farbe) {
        super(marke, farbe);
    }
    void info() {
        System.out.println("EAuto: " + getMarke());
        System.out.println("Farbe: " + getFarbe());
    }
}

class Motor {

}

class FahrWerk {

}

class Fahrer {
    
}