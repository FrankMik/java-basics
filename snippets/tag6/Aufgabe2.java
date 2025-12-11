package tag6;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die erste Zahl ein:");
        int zahl1 = scanner.nextInt();
        System.out.println("Geben Sie die zweite Zahl ein:");
        int zahl2 = scanner.nextInt();
        int groessereZahl = Math.max(zahl1, zahl2);
        System.out.println("Die größere Zahl ist: " + groessereZahl);
        scanner.close();
    }
}
