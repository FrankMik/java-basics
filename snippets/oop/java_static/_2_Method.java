package oop.java_static;

public class _2_Method {
    public static void main(String[] args) {
        Berechnung ber = new Berechnung();
        int summe1 = Berechnung.addieren(5, 5);
        int summe2 = Berechnung.addieren(5, 5, 5);
        int summe3 = ber.addieren2(3, 3);
        System.out.println(summe1);
        System.out.println(summe2);
        System.out.println(summe3);
    }
}

class Berechnung {

    public static int addieren(int a, int b) {
        return a + b;
    }

    public static int addieren(int a, int b, int c) {
        return a + b + c;
    }

    int addieren2(int a, int b) {
        return a + b;
    }
}
