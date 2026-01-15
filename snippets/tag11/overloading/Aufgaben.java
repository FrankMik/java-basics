package tag11.overloading;

import java.util.Scanner;

public class Aufgaben {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie heißt du?");
        String name = scanner.nextLine();
        begruessung();
        begruessung(name);
        begruessung(name, "Mustermann 😅");
        System.out.println("---------------------------------------------");
        System.out.println("Wie viel Euro hast du ausgegeben?");
        int euro = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wie viele Cent hast du ausgegeben?");
        int cent = scanner.nextInt();
        scanner.nextLine();
        int summeInEuro = einkaufssumme(euro);
        double summeInCent = einkaufssumme(cent);
        System.out.println("Einkaufssumme in Euro: " + summeInEuro + " Euro");
        System.out.println("Einkaufssumme in Cent: " + summeInCent + " Cent");
        System.out.println("--------------------------------------------");
        System.out.println("Möchtest du eine Nachricht per SMS oder E-Mail sendeen?");
        System.out.println("# 1 für SMS");
        System.out.println("# 2 für E-Mail");
        while (true) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("SMS");
                    break;
                case 2:
                    System.out.println("E-Mail");
                    break;
                default:
                    System.out.println("Ungültige Eingabe. Bitte gib 1 für SMS oder 2 für E-Mail ein.");
                    continue;
            }
            if (choice == 1) {
                System.out.println("Gebe die Numer ein");
                String sms = scanner.nextLine();
                nachticht(sms);
            } else if (choice == 2) {
                System.out.println("Gebe die E-Mail ein");
                String email = scanner.nextLine();
                nachticht(email);
            }
        }
    }

    /* 1. Begrüßung einer Person oder einfach allgemein
    Ein kleines Programm, das eine allgemeine Begrüßung ausgibt oder eine Person beim Namen anspricht. */    
    static void begruessung() {
        System.out.println("Hallo!");
    }

    static void begruessung(String name) {
        System.out.println("Hallo, " + name + "!");
    }
    static void begruessung(String vorname, String nachname) {
        System.out.println("Hallo, " + vorname + " " + nachname + "!");
    }


    /*2. Einkaufssumme berechnen in Cent oder Euro
    Es werden Einkaufssummen entweder als ganze Cent oder als Euro mit Komma zusammengezählt. */
    static int einkaufssumme(int euro) {
        return euro;
    }
    static double einkaufssumme(double cent) {
        return cent;
    }

    /*3. Nachricht per E-Mail oder SMS senden
    Eine kurze Nachricht wird entweder an eine E-Mail-Adresse oder an eine Handynummer gesendet. */
    static void nachticht(String email) {
        System.out.println("Nachricht an " + email + " gesendet.");
    }

    static void nachticht(int sms) {
        System.out.println("Nachricht an " + sms + " gesendet.");
    }

}
