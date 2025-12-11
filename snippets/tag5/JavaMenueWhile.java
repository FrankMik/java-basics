package tag5;

import java.util.Scanner;

public class JavaMenueWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int auswahl = 0;
        while (auswahl != 3) {
            System.out.println("##### Menü: #######");
            System.out.println("# 1. Start        #");
            System.out.println("# 2. Eistellungen #");  
            System.out.println("# 3. Beenden      #");
            System.out.println("Bitte wählen Sie eine Option (1-3): ");

            auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    System.out.println("Start ausgewählt.");
                    break;
                case 2:
                    System.out.println("Einstellungen ausgewählt.");
                    break;
                case 3:
                    System.out.println("Programm wird beendet.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ungültige Auswahl. Bitte versuchen Sie es erneut.");
                    break;
            }
        }

        scanner.close();
    }
}
