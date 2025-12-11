package tag6;

import java.util.Scanner;

public class Aufgabe5 {
    // Durchschnitt zweier Zahlen berechnen und runden
    // Mit Scanner
    // Eingabe Zahl1 = 
    // Eingabe Zahl2 = 

    // Ausgabe Durchschnitt gerundet
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe die erste Zahl ein: ");
        String zahl1 = scanner.nextLine();
        zahl1 = zahl1.replace(",",".");
        double zahl1Double = Double.parseDouble(zahl1);
        System.out.println("Gebe die zweite Zahl ein: ");
        String zahl2 = scanner.nextLine();
        zahl2 = zahl2.replace(",",".");
        double zahl2Double = Double.parseDouble(zahl2);
        double durchschnitt = (zahl1Double + zahl2Double) / 2;
        double gerundet = Math.round(durchschnitt);
        System.out.println("Durchschnitt gerundet: " + gerundet);
        scanner.close();
    }
}
