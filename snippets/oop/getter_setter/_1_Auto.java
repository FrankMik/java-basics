package oop.getter_setter;

public class _1_Auto {
    String marke;
    String farbe;

    public _1_Auto(String marke, String farbe) {
        this.marke = marke;
        this.farbe = farbe;
    }
    public static void main(String[] args) {
        _1_Auto auto = new _1_Auto("BMW", "scwarz");

        System.out.println(auto.farbe + " " + auto.marke);

        auto.farbe = "weiß";
        auto.marke = "VW";
        
        System.out.println(auto.farbe + " " + auto.marke);
    }
}
