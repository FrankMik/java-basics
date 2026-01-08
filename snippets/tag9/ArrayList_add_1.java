package tag9;

import java.util.ArrayList;

public class ArrayList_add_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        boolean y = list.add("Orange");

        //Ausgabe roh daten
        System.out.println(list);

        //Ausgabe der daten
        System.out.println(list.size());

        // An position einfügen
        list.add(1, "Grapes");

        //löschen der daten
        list.remove(3);

        // Die liste löschen
        // list.clear();

        //Überprüfen ob ein wert vorhanden ist
        boolean blabla = list.contains("Coconut");
        System.out.println(blabla);

        // Ausgabe der liste nach änderungen
        System.out.println(y);

        //Index eines elements
        int index = list.indexOf("Banana");
        System.out.println(index);
    }
}
