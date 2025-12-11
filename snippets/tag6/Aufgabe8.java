package tag6;

import java.util.Scanner;

public class Aufgabe8 {
    // BMI berechnen und abrunden
    // (BMI = Gewicht / (Größe²))
    // Gewicht eingeben:
    // Größe eingeben:

    // Ausgabe:
    // ihr BMI ist ???
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe dein Gewicht in kg. ein: ");
        String gewicht = scanner.nextLine();
        gewicht = gewicht.replace(",", ".");
        double gew = Double.parseDouble(gewicht);
        System.out.println("Gebe deine Größe in m. ein: ");
        String groesse = scanner.nextLine();
        groesse = groesse.replace(",", ".");
        double gro = Double.parseDouble(groesse);

        double bmi = gew / Math.pow(gro, 2);
        double bmiAbgerundet = Math.floor(bmi);

        System.out.printf("Ihr BMI ist: %.2f%n", + bmi);
        System.out.printf("Abgerundet ist Ihr BMI: %.0f%n", + bmiAbgerundet);

    }
}
