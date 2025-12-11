package tag6;

import java.util.Scanner;

public class Aufgabe1 {
    // Absoluten Wert einer Benutzereingabe anzeigen
    // Use Case: Nutzer gibt eine beliebige Zahl ein → es soll immer ein positiver Wert ausgegeben werden.
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bitte eine Zahl eingeben: ");
    int zahl = scanner.nextInt();
    int absoluterWert = Math.abs(zahl);
    System.out.println(absoluterWert);

    scanner.close();
}
}
