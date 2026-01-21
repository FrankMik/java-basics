package oop.firstclass;

public class Car {

    String marke;
    String farbe;

    void fahren(String marke) {
        System.out.println("Das Auto " + marke + " fährt!");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.farbe = "Schwarz";
        myCar.marke = "BMW";
        myCar.fahren(myCar.marke);
        System.out.println("Marke: " + myCar.marke + ", Farbe: " + myCar.farbe);

        Car myCar1 = new Car();
        myCar1.farbe = "Rot";
        myCar1.marke = "VW";
        myCar1.fahren(myCar1.marke);
        System.out.println("Marke: " + myCar1.marke + ", Farbe: " + myCar1.farbe);
    }
}
