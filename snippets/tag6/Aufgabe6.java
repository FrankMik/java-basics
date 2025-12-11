package tag6;

import java.util.Scanner;

public class Aufgabe6 {
    // Leerzeichen in einem Satz durch Unterstriche ersetzen
    // Use Case: Benutzer gibt einen Satz ein,leerzeichen sollen durch unterstriche ersetzen _ werden.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe einen Satz ein:");
        String input = scanner.nextLine();
        String output = input.replace(" ", "_");
        System.out.println("Geänderter Satz: " + output);
        scanner.close();
    }
}
