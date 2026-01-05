package tag1;

public class Variablen {
    public static void main(String[] args) {
        int alter; //Deklaration
        alter = 37; //Initialisierung

        int jahr = 1988; //Deklaration + Initialisierung

        String name = "Max Mustermann"; //Referenztyp

        float myfloat = 5.99f; //Gleitkommazahl

        char buchstabe = 'A'; //Einzelnes Zeichen

        boolean wahrheit = true; //Wahrheitswert

        byte kleinZahl = 100; //Kleiner Ganzzahltyp (-128 bis 127)

        short kurzZahl = 10000; //Kleiner Ganzzahltyp (-32,768 bis 32,767)

        Long grosseZahl = 15000000000L; //Großer Ganzzahltyp

        double grosseGleitkommazahl = 19.99; //Doppelt genaue Gleitkommazahl

        final double Pi = 3.14159; //Konvention: Konstanten in Großbuchstaben (final man kann nicht ändern)

        char myVar = 65, myVar2 = 66, myVar3 = 67; //Mehrere Variablen desselben Typs deklarieren

        System.out.println("Alter: " + alter);
        System.out.println("Jahr: " + jahr);
        System.out.println("Name: " + name);
        System.out.println("Float: " + myfloat);
        System.out.println("Buchstabe: " + buchstabe);
        System.out.println("Wahrheit: " + wahrheit);
        System.out.println("Byte: " + kleinZahl);
        System.out.println("Short: " + kurzZahl);
        System.out.println("Long: " + grosseZahl);
        System.out.println("Double: " + grosseGleitkommazahl);
        System.out.println("Pi: " + Pi);

        System.out.println(myVar);
        System.out.println(myVar2);
        System.out.println(myVar3);

    }
}
