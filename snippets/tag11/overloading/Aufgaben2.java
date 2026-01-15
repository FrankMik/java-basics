package tag11.overloading;

public class Aufgaben2 {
    public static void main(String[] args) {
       
        System.out.println("Rabattierter Preis: " + rabatt(58.96, 7));
        System.out.println("Rabattierter Preis: " + rabatt(120.0, 15));

        System.out.println("------------------------------- ");
        
        System.out.println("Groesser (int): " + groesser(7, 12));
        System.out.println("Groesser (double): " + groesser(7.5, 7.2));
    }

    /* 4. Rabatt auf einen Preis anwenden
    Entweder ein fester Betrag oder ein prozentualer Rabatt wird vom Preis abgezogen.
    rabatt(120.0, 10.0);
    rabatt(120.0, 15); */
    static double rabatt(double preis, double betrag) {
        return preis - betrag;
    }

    static double rabatt(double preis, int prozent) {
        return preis - (preis * prozent / 100);
    }


    /* 5. Größeren Wert finden
    Das Programm gibt den größeren von zwei Zahlen zurück, egal ob es ganze Zahlen oder Kommazahlen sind.
    System.out.println("Groesser (int): " + groesser(7, 12));
    System.out.println("Groesser (double): " + groesser(7.5, 7.2)); */
    static int groesser(int a, int b) {
        return (a > b) ? a : b;
    }
    static double groesser(double a, double b) {
        return (a > b) ? a : b;
    }

}
