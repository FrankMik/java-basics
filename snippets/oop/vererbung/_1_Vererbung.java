package oop.vererbung;

public class _1_Vererbung {
    public static void main(String[] args) {
        EAuto ea1 = new EAuto("BMW", "schwarz", 85);
        ea1.info();
        ea1.starten();
        EBike ebike = new EBike("CUBE", "rot", 92);
        ebike.info();

    }
}

// class Fahrzeug {
//     protected String marke;
//     protected String farbe;

//     public Fahrzeug(String marke, String farbe) {
//         this.marke = marke;
//         this.farbe = farbe;
//     }

//     public void info() {
//         System.out.println("Auto: " + marke + ", farbe: " + farbe);
//     }

//     public void starten() {
//         System.out.println(marke + " startet den Motor...");
//     }
    
// }

// class EAuto extends Fahrzeug {
//     private int akkuKap;
//     public EAuto(String marke, String farbe, int akkuKap) {
//         super(marke, farbe);
//         this.akkuKap = akkuKap;
//     }

//     public void info() {
//         System.out.println("E-Auto: " + marke + ", farbe: " + farbe + " hat Akkukapazität: " + akkuKap);
//     }
// }