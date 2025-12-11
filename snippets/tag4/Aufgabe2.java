package tag4;

import java.util.Scanner;

public class Aufgabe2 {
    // Benutzer gibt eine Artikelnummer ein → Produktcode und Seriennummer trennen
    // Use Case: Artikelnummern, z. B. PROD-12345. Man will Produktcode und Nummer trennen.
    // Das ganze mit der Scanner Methode

    // Ausgabe:
    // ProduktCode:PROD
    // SerienNummer:12345
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Artikelnummer ein (Format: CODE-NUMMER): ");
        String artikelnummer = scanner.nextLine(); 
        int trennIndex = artikelnummer.indexOf('-');
        String produktCode = artikelnummer.substring(0, trennIndex);
        String serienNummer = artikelnummer.substring(trennIndex + 1);
        System.out.println("ProduktCode: " + produktCode);
        System.out.println("SerienNummer: " + serienNummer);
        scanner.close();
    }
}
