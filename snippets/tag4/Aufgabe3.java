package tag4;

import java.util.Scanner;

public class Aufgabe3 {
    // Farbeingabe prüfen („rot“, „grün“, „blau“) – egal wie geschrieben
    // Use Case: egal wie geschrieben Eingabe vereinfacht!

    // Ausgabe:
    // Du hast rot gewählt
    // Du hast grün gewählt
    // Du hast blau gewählt
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib eine Farbe ein (rot, grün, blau): ");
        String farbe = scanner.nextLine();
        if (farbe.equalsIgnoreCase("rot")) {
            System.out.println("Du hast rot gewählt");
        } else if (farbe.equalsIgnoreCase("grün")) {
            System.out.println("Du hast grün gewählt");
        } else if (farbe.equalsIgnoreCase("blau")) {
            System.out.println("Du hast blau gewählt");
        } else {
            System.out.println("Unbekannte Farbe");
        }
        scanner.close();
    }
}
