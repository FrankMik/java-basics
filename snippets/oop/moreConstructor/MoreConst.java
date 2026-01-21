package oop.moreConstructor;

public class MoreConst {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.info();
        Auto auto2 = new Auto("BMW");
        auto2.info();
        Auto auto3 = new Auto("12321", "rot", 120);
        auto3.info();

    }
}

class Auto {

    String marke;
    String farbe;
    int geschw;

    // konstruktor ohne Parameter
    Auto() {
        marke = "Unbekannt";
        farbe = "Schwarz";
        geschw = 0;
    }

    // konstruktor mit Parameter
    Auto(String marke) {
        this.marke = marke;
        farbe = "Weis";
        geschw = 10;
    }

    Auto(String marke, String farbe, int geschw) {
        this.marke = marke;
        this.farbe = farbe;
        this.geschw = geschw;
    }

    void info() {
        System.out.println("Marke:" + marke + " Farbe:" + farbe + " Geschw:" + geschw);
    }
}
