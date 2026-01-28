package oop.vererbung2.schritt7;

public class Motor {
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
