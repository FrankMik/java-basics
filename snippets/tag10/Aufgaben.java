package tag10;

/* 1. Du möchtest eine kurze Begrüßung ausgeben, ohne etwas zu übergeben.
Tipp: Eine Methode mit void gibt keinen Wert zurück.

2. Du willst jemanden mit seinem Vorname und NachNamen begrüßen.
Tipp: In den runden Klammern stehen Eingaben (Parameter) für die Methode.

3. Zwei kleine Zahlen sollen addiert und das Ergebnis gezeigt werden.
Tipp: return gibt den berechneten Wert an die aufrufende Stelle zurück.

4. Du möchtest wissen, wie lang ein Wort ist.
Tipp: Prüfe auf null, um Fehler zu vermeiden.

5. Die Zahlen von 1 bis n sollen aufaddiert werden.
Tipp: Eine Methode kann in einer Schleife rechnen und am Ende das Ergebnis zurückgeben. */

public class Aufgaben {
    public static void main(String[] args) {
        // Aufgabe 1
        begruessung();
        // Aufgabe 2
        nameBegr("Stefan", "Tissot");
        // Aufgabe 3
        int summe = addiere(9, 15);
        System.out.println("Die Summe von eingegebenen Zahlen ist: " + summe);
        // Aufgabe 4
        int wortLaenge = laenge("Computer");
        System.out.println("Die Länge des eingegebenen Wortes ist: " + wortLaenge + " (gerechnet mit Leerzeichen)");
        // Aufgabe 5
        int ergebnis = summe(9);
        System.out.println("Die Summe von 1 bis n (die wir eingegeben haben) ist: " + ergebnis);
    }

    public static void begruessung() {
        System.out.println("Hallo und guten Morgen!");
    }

    public static void nameBegr(String vorname, String nachname) {
        System.out.println("Hallo " + vorname + " " + nachname + "!");
    }

    public static int addiere(int zahl1, int zahl2) {
        return zahl1 + zahl2;
    }

    public static int laenge(String word) {
        if (word == null) {
            return 0;
        }
        return word.length();
    }

    public static int summe(int n) {
        int erg = 0;
        for(int i = 1; i <=n; i++) {
            erg += i;
        }
        return erg;
    }
}
