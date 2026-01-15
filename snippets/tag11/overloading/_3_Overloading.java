package tag11.overloading;

public class _3_Overloading {
    public static void main(String[] args) {
        double kreis = flaeche(90);
        double rechteck = flaeche(33.6, 46.8);
        int quadrat = flaeche(9);
        System.out.println("Kreisfläche: " + kreis);
        System.out.println("Rechtecksfläche: " + rechteck);
        System.out.println("Quadratfläche: " + quadrat);
    }

    // Kreisfläche berechnen
    static double flaeche(double radius) {
        return Math.PI * radius * radius;
    }

    // Rechtecksfläche berechnen
    static double flaeche(double laenge, double breite) {
        return laenge * breite;
    }

    // Quadratfläche berechnen
    static int flaeche(int seite) {
        return seite * seite;
    }
}
