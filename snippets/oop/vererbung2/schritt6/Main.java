package oop.vererbung2.schritt6;

// wir erweitern den motor ein
public class Main {
    public static void main(String[] args) {
        FahrWerk fWerk = new FahrWerk("Stall", "Standart");
        VerbrennerAuto verbAu = new VerbrennerAuto("BMW", "schwarz", new Motor(174, "Benziner"), fWerk);
        verbAu.info();
        verbAu.verbrauch(50);

        System.out.println("################################################");
        
        Motor m1 = new Motor(250, "Electro");
        EAuto eAuto = new EAuto("Tesla", "weiß", m1, new FahrWerk("Plastik", "Leicht"));
        eAuto.info();
        eAuto.verbrauch(150);
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
    private double benzinVerbrauchAuf100km = 5.3;
    private Motor motor = null;
    private FahrWerk werk = null;
    VerbrennerAuto(String marke, String farbe, Motor motor, FahrWerk werk) {
        super(marke, farbe);
        this.motor = motor;
        this.werk = werk;
    }

    private double verbrauchRechner(int km) {
        return (km/100.0) * this.benzinVerbrauchAuf100km;
    }

    void verbrauch(int km) {
        System.out.println("Verbrauch auf " + km + "km " + verbrauchRechner(km) + "Liter");
    }

    void info() {
        System.out.println("Verbrenner: " + getMarke());
        System.out.println("Farbe: " + getFarbe());
        motor.motorInfo();
        werk.fahrWerk();
    }
}

class EAuto extends Fahrzeug {
    private int stromVerbrauchAuf100km = 45;
    private Motor motor = null;
    private FahrWerk werk = null;
    EAuto(String marke, String farbe, Motor motor, FahrWerk werk) {
        super(marke, farbe);
        this.motor = motor;
        this.werk = werk;
    }
    private double verbrauchRechner(int km) {
        return (km/100.0) * this.stromVerbrauchAuf100km;
    }

    void verbrauch(int km) {
        System.out.println("Verbrauch auf " + km + "km " + verbrauchRechner(km) + "Kw/h");
    }

    void info() {
        System.out.println("EAuto: " + getMarke());
        System.out.println("Farbe: " + getFarbe());
        motor.motorInfo();
        werk.fahrWerk();
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
    private String material = null;
    private String typ = null;

    FahrWerk(String material, String typ) {
        this.material = material;
        this.typ = typ;
    }

    void fahrWerk() {
        System.out.println("Material: " + material);
        System.out.println("Typ: " + typ);
    }
}

class Fahrer {
    
}