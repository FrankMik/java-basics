package oop.vererbung2.schritt7;

public class EAuto extends Fahrzeug {
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
