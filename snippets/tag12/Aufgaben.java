package tag12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Aufgaben {
    public static void main(String[] args) {
        /* 1. Du trägst deinen Geburtstag ein und willst ihn im Format Tag.Monat.Jahr anzeigen. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Gebe deine Geburtsjahr ein:");
        int gj = sc.nextInt();
        System.out.println("Gebe dein Geburtsmonat ein: ");
        int gm = sc.nextInt();
        System.out.println("Gebe deinen Gebutrstag ein: ");
        int gt = sc.nextInt();
        LocalDate datum = LocalDate.of(gj, gm, gt);
        DateTimeFormatter formatiert = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Formatierte date ist: " + datum.format(formatiert));
        System.out.println("---------------------------------------------------");

        /* 2. Du leihst heute ein Buch aus, Rückgabe ist in 14 Tagen. Prüfe, ob es überfällig, heute fällig oder noch Zeit ist. */
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Wann haßt du das Buch ausgeliehen? (dd.MM.yyyy)");
        String date = sc2.next();
        DateTimeFormatter inputform = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate start = LocalDate.parse(date, inputform);
        LocalDate heute = LocalDate.now();
        LocalDate ende = start.plusDays(14);
        if (heute.isEqual(ende)) {
            System.out.println("Rückgabe ist heute!");
        } else if (heute.isBefore(ende)) {
            System.out.println("Du haßt noch Zeit");
        } else {
            System.out.println("Rückgabe ist überfällig!!!");
        }
     }
}
