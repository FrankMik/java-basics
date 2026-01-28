package oop.vererbung2.schritt6;

// wir bauen Fahrwerk ein
public class Main {
    public static void main(String[] args) {
        Motor bMotor = new Motor(174, "Benziner", 50);
        bMotor.setVerbrauchAuf100km(5.5);
        FahrWerk fWerk = new FahrWerk("Stall", "Standart");
        VerbrennerAuto verbAu = new VerbrennerAuto("BMW", "schwarz", bMotor , fWerk);
        Fahrer bFahrer = new Fahrer("Peter", 36);
        verbAu.setFahrer(bFahrer);
        verbAu.info();

        System.out.println("################################################");
        
        Motor m1 = new Motor(250, "Electro", 150);
        m1.setVerbrauchAuf100km(85);
        EAuto eAuto = new EAuto("Tesla", "weiß", m1, new FahrWerk("Plastik", "Leicht"));
        Fahrer eFahrer = new Fahrer("Max", 17);
        eAuto.setFahrer(eFahrer);
        eAuto.info();
    }
}

class Fahrzeug {
    private String marke;
    private String farbe;
    private Fahrer fahrer;

    Fahrzeug(String marke, String farbe) {
        this.marke = marke;
        this.farbe = farbe;
    }

    public void setFahrer(Fahrer fahrer) {
        this.fahrer = fahrer;
    }

    public String getMarke() {
        return marke;
    }

    public String getFarbe() {
        return farbe;
    }

    void fahrerInfo() {
        if (fahrer != null) {
            if (fahrer.fahrErlaubniss()) {
                System.out.println("Fahrer: " + fahrer.getName() + " ist " + fahrer.getAlter() + " Jahre");
            } else {
                System.out.println("Fahrer: " + fahrer.getName() + " ist " + fahrer.getAlter() + " Jahre, darf nicht fahren!");
            }
            
        } else {
            System.out.println("Fahrer: keiner");
        }
    }

    void info() {
        System.out.println("Auto: " + marke);
        System.out.println("Farbe: " + farbe);
    }

}

class VerbrennerAuto extends Fahrzeug {
    private Motor motor = null;
    private FahrWerk werk = null;
    VerbrennerAuto(String marke, String farbe, Motor motor, FahrWerk werk) {
        super(marke, farbe);
        this.motor = motor;
        this.werk = werk;
    }

    void info() {
        fahrerInfo();
        System.out.println("Verbrenner: " + getMarke());
        System.out.println("Farbe: " + getFarbe());
        motor.motorInfo();
        werk.fahrWerk();
    }
}

class EAuto extends Fahrzeug {
    private Motor motor = null;
    private FahrWerk werk = null;
    EAuto(String marke, String farbe, Motor motor, FahrWerk werk) {
        super(marke, farbe);
        this.motor = motor;
        this.werk = werk;
    }

    void info() {
        fahrerInfo();
        System.out.println("EAuto: " + getMarke());
        System.out.println("Farbe: " + getFarbe());
        motor.motorInfo();
        werk.fahrWerk();
    }
}

class Motor {
    private int ps = 0;
    private String typ = null;
    private double verbrauchAuf100km = 0;
    private int km;

    Motor(int ps, String typ, int km) {
        this.ps = ps;
        this.typ = typ;
        this.km = km;
    }

    public void setVerbrauchAuf100km(double verbrauchAuf100km) {
        this.verbrauchAuf100km = verbrauchAuf100km;
    }

    private double verbrauchRechner(int km) {
        return (km/100.0) * this.verbrauchAuf100km;
    }

    void motorInfo() {
        System.out.println("Motortyp: " + typ);
        System.out.println("PS: " + ps);
        System.out.println("Verbrauch auf " + km + "km = " + verbrauchRechner(km));
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
        System.out.println("FahrWerk Material: " + material);
        System.out.println("FahrWerk Typ: " + typ);
    }
}

class Fahrer {
    private String name;
    private int alter;

    Fahrer(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    boolean fahrErlaubniss() {
       // return alter < 18?false:true;
       return alter >= 18;
    }
}