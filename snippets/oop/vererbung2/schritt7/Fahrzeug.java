package oop.vererbung2.schritt7;

public class Fahrzeug {
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
