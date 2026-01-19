package mylib.java_localdate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _2_Frist {
    public static void main(String[] args) {
        // Frist berechnung
        Scanner sc = new Scanner(System.in);
        System.out.println("Frist in Tagen:");
        int tage = sc.nextInt();
        LocalDate fristEnde = LocalDate.now().plusDays(tage);
        System.out.println("Frist endet am: " + fristEnde);
        sc.close();

        // Datum in der Vergangenheit prüfen
        // Scanner sc2 = new Scanner(System.in);
        // System.out.println("Geben Sie Jahr ein:");
        // int jahr = sc2.nextInt();
        // LocalDate datum = LocalDate.of(jahr, 1, 1);
        // LocalDate heute = LocalDate.now();
        // if (datum.isBefore(heute)) {
        //     System.out.println("Das Datum liegt in der Vergangenheit.");
        // } else {
        //     System.out.println("Das Datum liegt in der Zukunft.");
            
        // }
        // sc2.close();

        // wie viele Tage seit 1970-01-01 vergangen sind
        LocalDate heute2 = LocalDate.now();
        long timeStamp = heute2.toEpochDay();
        System.out.println(timeStamp);

        // Zeitstempel in Sekunden seit 1970-01-01 00:00:00 UTC
        LocalTime lt = LocalTime.now();
        long tt = heute2.toEpochSecond(lt, java.time.ZoneOffset.UTC);
        System.out.println(tt);

        // Frist berechnung Beispiel
        LocalDate start = LocalDate.of(2026, 1, 19);
        LocalDate ende = start.plusDays(30);
        System.out.println("Ende: " + ende);

        // in die Vergangenheit
        LocalDate start1 = LocalDate.of(2026, 1, 19);
        LocalDate ende1 = start1.minusDays(30);
        System.out.println("Ende: " + ende1);

        // Datum vergleichen eine später als die andere
        LocalDate a = LocalDate.of(2026, 1, 19);
        LocalDate b = LocalDate.of(2026, 8, 19);
        boolean erg = a.isAfter(b);
        System.out.println(erg); // false

        // Datum vergleichen ob gleich
        LocalDate aa = LocalDate.of(2026, 1, 19);
        LocalDate bb = LocalDate.of(2026, 1, 19);
        boolean gleich = aa.isEqual(bb);
        System.out.println(gleich); // true

        // Datum auf Deutsch formatieren
        LocalDate datum = LocalDate.of(2026, 1, 19);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println(datum.format(formatter)); // 19.01.2026
    }
}
