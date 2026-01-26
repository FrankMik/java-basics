package oop.vererbung;

public class EAuto extends Fahrzeug {
    private int akkuKap;
    public EAuto(String marke, String farbe, int akkuKap) {
        super(marke, farbe);
        this.akkuKap = akkuKap;
    }

    public void info() {
        System.out.println("E-Auto: " + marke + ", farbe: " + farbe + ", hat Akkukapazität: " + akkuKap + "%");
    }
}
