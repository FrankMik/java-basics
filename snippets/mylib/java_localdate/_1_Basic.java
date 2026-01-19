package mylib.java_localdate;

import java.time.LocalDate;

public class _1_Basic {
    public static void main(String[] args) {
        LocalDate heute = LocalDate.now();
        System.out.println("Heutiges Datum: " + heute);

        LocalDate geburtstag = LocalDate.of(1988, 10, 9);
        System.out.println("Geburtstag: " + geburtstag);

        int jahr = heute.getYear();
        int monatsZahl = heute.getMonthValue();
        int tagDesMonats = heute.getDayOfMonth();
        System.out.println("Jahr: " + jahr + ", Monat: " + monatsZahl + ", Tag: " + tagDesMonats);

    }
}
