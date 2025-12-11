package tag5;

import java.util.Scanner;

public class Aufgabe1 {
    // Prüfen, ob eine Eingabe alphabetisch im richtigen Bereich liegt
    // Use Case: Namen alphabetisch einschränken (z. B. A–M oder N–Z).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe ein Nachname ein: ");
        String nname = scanner.nextLine();
        
        if (nname.compareTo("A") >= 0 && nname.compareTo("N") < 0) {
            System.out.println("Der Nachname " + nname + " liegt im Bereich zwieschen A und M.");
        } else {
            System.out.println("Der Nachname " + nname + " liegt im Bereich zwieschen N und Z.");
        }
        scanner.close();
    }
}
