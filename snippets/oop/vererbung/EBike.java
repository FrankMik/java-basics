package oop.vererbung;

public class EBike extends Fahrzeug {
    private int akkuKap;
    public EBike(String marke, String farbe, int akkuKap) {
        super(marke, farbe);
        this.akkuKap = akkuKap;
    }

    public void info() {
        System.out.println("E-Bike: " + marke + ", farbe: " + farbe + ", hat Akkukapazität: " + akkuKap + "%");
    }
}
