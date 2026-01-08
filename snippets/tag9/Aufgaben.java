package tag9;

import java.util.ArrayList;

public class Aufgaben {
    
    public static void main(String[] args) {
        
        /* 1. Lege eine kleine Einkaufsliste an, füge ein paar Dinge hinzu und gib alles aus.
        Tipp: Eine Liste hat einen Datentyp in spitzen Klammern, zum Beispiel String. */

        System.out.println(ConsoleColors.GREEN + "Einkaufsliste:" + ConsoleColors.RESET);
        ArrayList<String> einkaufsliste = new ArrayList<>();
        einkaufsliste.add("Milch");
        einkaufsliste.add("Brot");
        einkaufsliste.add("Eier");
        einkaufsliste.add("Äpfel");
        einkaufsliste.add("Käse");
        einkaufsliste.add("Butter");
        einkaufsliste.add("Tomaten");
        for (String item : einkaufsliste) {
            System.out.println(ConsoleColors.GREEN + item + ConsoleColors.RESET);
        }
        System.out.println(ConsoleColors.GREEN + "##################################" + ConsoleColors.RESET);


        /* 2. Sammle Namen von Teilnehmern, füge mehrere hinzu und zeige Anzahl und Inhalt.
        Tipp: size() zeigt dir, wie viele Elemente in der Liste sind. */

        System.out.println(ConsoleColors.RED + "Teilnehmerliste:" + ConsoleColors.RESET);
        ArrayList<String> teilnehmer = new ArrayList<>();
        teilnehmer.add("Max");
        teilnehmer.add("Anna");
        teilnehmer.add("Tom");
        teilnehmer.add("Lisa");
        teilnehmer.add("Peter");
        teilnehmer.add("Sophie");
        System.out.println(ConsoleColors.RED + "Teilnehmeranzahl: " + teilnehmer.size() + " , die Namen sind: " + teilnehmer.toString() + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + "##################################" + ConsoleColors.RESET);


        /* 3. Füge nur passende Wörter (z. B. mit mindestens 5 Buchstaben) in eine neue Liste.
        Tipp: Du kannst add innerhalb von if-Blöcken gezielt einsetzen. */

        System.out.println(ConsoleColors.YELLOW + "Wörter filtern:" + ConsoleColors.RESET);
        ArrayList<String> worte = new ArrayList<>();
        worte.add("Haus");
        worte.add("Computer");
        worte.add("Baum");
        worte.add("Programmierung");
        worte.add("Auto");
        worte.add("Schule");
        worte.add("Laptop");
        worte.add("Katze");
        worte.add("Hund");
        ArrayList<String> passendeWorte = new ArrayList<>();
        for (String wort : worte) {
            if (wort.length() >= 5) {
                passendeWorte.add(wort);
            }
        }
        System.out.println(ConsoleColors.YELLOW + "Wörter mit mindestens 5 Buchstaben: ");
        System.out.println(passendeWorte.toString() + ConsoleColors.RESET);

    }
}

    class ConsoleColors {
        public static final String RESET = "\u001B[0m";
        public static final String RED = "\u001B[31m";
        public static final String GREEN = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
}
