package oop.getter_setter;

public class _3_Auto {
    
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setMarke("BMW");
        auto.setFarbe("schwarz");

        auto.info(122);

    }
}

class  Auto {
    private String marke;
    private String farbe;
    private double verbrauchProKm = 0.55;

    // public Auto(String marke, String farbe) {
    //     this.marke = marke;
    //     this.farbe = farbe;
    // }

    public String getMarke() {
        return marke;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    private double verbrauch(int km) {
        return km * this.verbrauchProKm;
    }

    public void info(int km) {
        double verb = this.verbrauch(km);
        System.out.println(
                "Auto: " + marke + ", Farbe: " + farbe + ", Verbrauch bei " + km + "km = " + String.format("%.2f", verb));
    }
}