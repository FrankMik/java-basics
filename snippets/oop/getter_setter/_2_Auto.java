package oop.getter_setter;

public class _2_Auto {
    private String marke;
    private String farbe;

    public _2_Auto(String marke, String farbe) {
        this.marke = marke;
        this.farbe = farbe;
    }

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

    public void info() {
        System.out.println("Auto: " + marke + ", farbe: " + farbe);
    }
    public static void main(String[] args) {
        _2_Auto auto = new _2_Auto("BMW", "scwarz");
        auto.setMarke("VW");
        auto.setFarbe("weiß");

        auto.info();
    }
}
