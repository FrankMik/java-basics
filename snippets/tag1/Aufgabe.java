package tag1;

public class Aufgabe {
    public static void main(String[] args) {
//1. Du möchtest deinen Namen und dein Alter speichern und in einem Satz ausgeben.
//Tipp: Texte (Strings) stehen in doppelten Anführungszeichen.
        String name = "Michael";
        int age = 37;

        System.out.println("Hallo, ich heiße " + name + ", ich bin " + age + " Jahre alt.");

//2. Du kaufst zwei Früchte und willst die Summe der Preise anzeigen.
//Tipp: Für Kommazahlen nutzt Java den Punkt, nicht das Komma.
        double apple = 0.75;
        double banana = 0.50;
        double total = apple + banana;

        System.out.println("Der Gesamtpreis der Früchte beträgt: " + total + " Euro.");

//3. Du willst die Fläche eines Rechtecks mit Breite und Höhe berechnen.
//Tipp: Multipliziere Breite und Höhe, um die Fläche zu erhalten.
        int width = 5;
        int height = 10;
        int area = width * height;

        System.out.println("Die Fläche des Rechtecks beträgt: " + area + " Quadrat-Einheiten.");

// 4. Du möchtest eine Temperatur von Celsius in Fahrenheit umrechnen.
// Tipp: Rechne erst, speichere das Ergebnis in einer Variable und gib es dann aus.
        double celsius = 20.0;
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + " Grad Celsius sind " + fahrenheit + " Grad Fahrenheit.");
    }
}
