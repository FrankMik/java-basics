package oop.vererbung2.schritt4;

// wir bauen den motor ein
public class Main {
    public static void main(String[] args) {
        VerbrennerAuto verbAu = new VerbrennerAuto("BMW", "schwarz", new Motor(174, "Benziner"));
        verbAu.info();

        System.out.println("################################################");
        
        Motor m1 = new Motor(250, "Electro");
        EAuto eAuto = new EAuto("Tesla", "weiß", m1);
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
    private Motor motor = null;
    VerbrennerAuto(String marke, String farbe, Motor motor) {
        super(marke, farbe);
        this.motor = motor;
    }
    void info() {
        System.out.println("Verbrenner: " + getMarke());
        System.out.println("Farbe: " + getFarbe());
        motor.motorInfo();
    }
}

class EAuto extends Fahrzeug {
    private Motor motor = null;
    EAuto(String marke, String farbe, Motor motor) {
        super(marke, farbe);
        this.motor = motor;
    }
    void info() {
        System.out.println("EAuto: " + getMarke());
        System.out.println("Farbe: " + getFarbe());
        motor.motorInfo();
    }
}

class Motor {
    private int ps = 0;
    private String typ = null;

    Motor(int ps, String typ) {
        this.ps = ps;
        this.typ = typ;
    }

    void motorInfo() {
        System.out.println("Motortyp: " + typ);
        System.out.println("PS: " + ps);
    }
}

class FahrWerk {

}

class Fahrer {
    
}