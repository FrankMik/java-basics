package oop.abstractAufgabe;
/* Du willst verschiedene Tiere zu Wort kommen lassen. Jedes Tier macht ein eigenes Geräusch.
Tipp: Eine abstrakte Klasse kann nicht direkt erstellt werden, nur ihre Unterklassen. */
public class Main {
    public static void main(String[] args) {
        Katze katze1 = new Katze("Kitty", "schwarz", "hauskatze", 2);
        Hund hund1 = new Hund("Bello", "weiß", "scheffer", 3);
        Maus maus1 = new Maus("Mäuse", "grau", "rate", 7);

        katze1.geraeusch();
        katze1.info();
        System.out.println("##############################################");

        hund1.geraeusch();
        hund1.info();
        System.out.println("##############################################");

        maus1.geraeusch();
        maus1.info();
    }
}
