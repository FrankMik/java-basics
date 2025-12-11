package tag5;

import java.util.Scanner;

public class Aufgabe2 {
    // Code-Bestandteile zu einer Artikelnummer verbinden
    // Use Case: Benutzer gibt Teile einer Artikelnummer ein

    // Bitte Produktname eingeben:
    // Bitte SerienNummer eingeben:

    // ergebniss: xyqq-12345
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Produktname eingeben: ");
        String produktName = scanner.nextLine();
        System.out.print("Bitte SerienNummer eingeben: ");
        String serienNummer = scanner.nextLine();
        String artikelNummer = produktName.concat("-").concat(serienNummer);
        System.out.println("Ergebniss: " + artikelNummer);
        scanner.close();
        
    }
}
