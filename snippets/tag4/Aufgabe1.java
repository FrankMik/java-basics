package tag4;

import java.util.Scanner;

public class Aufgabe1 {
    // Benutzer gibt eine E-Mail ein → Domain auslesen
    // Use Case: Man möchte den Teil der E-Mail hinter dem @ ermitteln.
    // Das ganze mit dem Scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe deine E-Mail Adresse ein: ");
        String email = scanner.nextLine();
        int domain = email.indexOf('@');
        String domainName = email.substring(domain + 1);
        System.out.println("Die Domain deiner E-Mail Adresse ist: " + domainName);
        scanner.close();
    }
}
