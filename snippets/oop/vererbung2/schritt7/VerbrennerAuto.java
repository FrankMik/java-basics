package oop.vererbung2.schritt7;

public class VerbrennerAuto extends Fahrzeug {
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
    
