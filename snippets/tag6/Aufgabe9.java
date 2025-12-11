package tag6;

import java.util.Random;
import java.util.Scanner;

public class Aufgabe9 {
    // Benutzer legt Bereich selbst fest, Zufallszahl min–max

    // eingabe1: z.b 20
    // eingabe2: z.b 50

    // Ausgabe: eine zahl zwischen 20-50
    public static void main(String[] args) {
        // Random rand = new Random();
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Geben Sie die untere Grenze (min) ein: ");
        // int min = scanner.nextInt();
        // System.out.println("Geben Sie die obere Grenze (max) ein: ");
        // int max = scanner.nextInt();
        
        // while (min >= max) {
        //     System.out.println("Ungültiger Bereich. Bitte stellen Sie sicher, dass min kleiner als max ist.");
        //     System.exit(0);
        // }
        // int zahl = rand.nextInt((max - min) + 1) + min; // Zufallszahl zwischen min und max
        // System.out.println("Zufallszahl zwischen " + min + " und " + max + ": " + zahl);


        //////////////////////////////////////////////////////////////////////////////////////////////
       
            Random random = new Random();
            Scanner sc = new Scanner(System.in);
            
            while (true) {  // Endlosschleife
                System.out.println("Geben Sie die untere Grenze (min) ein: ");
                int mini = sc.nextInt();
                System.out.println("Geben Sie die obere Grenze (max) ein: ");
                int maxi = sc.nextInt();
                
                if (mini < maxi) {  // Gültig → weiter
                    int zahl1 = random.nextInt((maxi - mini) + 1) + mini;
                    System.out.println("Zufallszahl zwischen " + mini + " und " + maxi + ": " + zahl1);
                    break;  // Schleife beenden
                } else {
                    System.out.println("Ungültiger Bereich. Versuchen Sie es erneut!");
                }
            }
            sc.close();

        // scanner.close();
    }
}
