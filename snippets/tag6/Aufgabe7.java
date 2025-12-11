package tag6;

import java.util.Scanner;

public class Aufgabe7 {
    // Preis eingeben auf den nächsten ganzen Euro aufrunden
    // Eingabe:z.b 6,40 auf 7,00 auf die nächstgrößere Zahl erhöhen
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zu bezahlen ist: ");
        System.out.println("Geben Sie den Preis ein: ");
        String preis = scanner.nextLine();
        preis = preis.replace(",", ".");
        double preisDouble = Double.parseDouble(preis);
        System.out.println("Möchten Sie an den Spendenaktionen teilnehmen? (j/n)");
        String antwort = scanner.next();
        if (antwort.equalsIgnoreCase("j")) {
            double aufgerundeterPreis = Math.ceil(preisDouble);
            System.out.println("Der aufgerundete Preis beträgt: " + aufgerundeterPreis + " Euro");
        } else {
            System.out.println("Der zu zahlende Preis beträgt: " + preisDouble + " Euro");
        }
        scanner.close();
    }
}
