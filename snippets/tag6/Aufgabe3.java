package tag6;

import java.util.Scanner;

public class Aufgabe3 {
    // Kubikwert (hoch 3) berechnen
    // Use Case: Berechnung von Volumen. a*b*c

    // Ausgabe: Kubikwert:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe eine Zahl ein");
        int zahl = scanner.nextInt();
        int wert = 3;
        double kubikwert = Math.pow(zahl, wert); 
        System.out.println("Der Kubikwert von " + zahl + " ist: " + kubikwert);

        scanner.close();
    }
}
