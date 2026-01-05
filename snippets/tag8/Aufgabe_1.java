package tag8; 

public class Aufgabe_1 {
    public static void main(String[] args) {
        /*1. Du willst die Namen aller Wochentage nacheinander anzeigen, zum Beispiel für einen Familienplaner.
        Tipp: Der erste Platz in einem Array hat die Nummer 0, nicht 1. */
        String[] wochentage = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
        for (String tag : wochentage) {
            System.out.println(tag);
        }

        //--------------------------------------------------

        /*2.  Du hast ein paar Preise im Kopf und möchtest die Gesamtsumme sehen, um zu wissen, ob dein Budget reicht.
        Tipp: Für Geldbeträge nimmst du in einfachen Übungen meist den Typ double.
        Ausgabe: 2 Stellen nach dem Komma. */
        double[] preise = {12.50, 8.75, 15.25, 20.00};
        double summe = 0;
        for (double preis : preise) {
            summe += preis;
        }
        System.out.printf("Gesamtsumme: %.2f\n", summe);

        //--------------------------------------------------

        /* 3. Du willst den Durchschnitt deiner Punktzahlen berechnen, um deine Leistung besser einzuschätzen.
        Tipp: Achte bei Division auf den Typ, sonst geht die Nachkommastelle verloren.
        Ausgabe z.b: Durchschnitt: 14.0*/
        double[] punkte = {10, 15, 20, 18};
        double summePunkte = 0;
        for (double punkt : punkte) {
            summePunkte += punkt;
        }
        double durchschnitt = summePunkte / punkte.length;
        System.out.printf("Durchschnitt: %.1f\n", durchschnitt);
    }
}
