package oop.vererbung2.schritt2;

public class Main {
    public static void main(String[] args) {
        
    }
}

class Fahrzeug {
    private String marke;
    private String farbe;

    Fahrzeug(String marke, String farbe) {
        this.marke = marke;
        this.farbe = farbe;
    }

    void info() {
        System.out.println("Auto: " + marke + " Farbe: " + farbe);
    }

}

class Motor {

}

class FahrWerk {

}

class Fahrer {
    
}