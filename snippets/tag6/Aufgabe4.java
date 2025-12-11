package tag6;

import java.util.Scanner;

public class Aufgabe4 {
    // Zufällige Lottozahl (1 bis 49) erzeugen
    // Use Case: Lotto.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lottoZahl = (int) (Math.random() * 49) + 1;
        System.out.println("Gebe deine Lottozahl (1-49) ein: ");
        int benutzerZahl = scanner.nextInt();
        if (benutzerZahl == lottoZahl) {
            System.out.println("Glückwunsch! Das ist die richtige Zahl " + lottoZahl + "!");
        } else {
            System.out.println("Leider falsch. Die richtige Zahl war " + lottoZahl + ".");
        }


        // int tipp = scanner.nextInt();

        // int lottoZahl = (int)(Math.random() * 49) + 1;

        // System.out.println("Deine Zahl: " + tipp);
        // System.out.println("Gezogene Zahl: " + lottoZahl);
        scanner.close();

    }
}
