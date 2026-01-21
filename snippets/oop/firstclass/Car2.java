package oop.firstclass;

public class Car2 {
    String marke;
    String farbe;

    void info() {
            System.out.println("Das Auto ist ein " + farbe + "er " + marke);
        }
    public Car2(String marke, String farbe) {
        this.marke = marke;
        this.farbe = farbe;
        
    }
    public static void main(String[] args) {
        Car2 auto1 = new Car2("BMW", "schwarz");
        auto1.info();
    }
}
