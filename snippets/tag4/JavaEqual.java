package tag4;

public class JavaEqual {
    public static void main(String[] args) {
        String wert1 = "Hallo";
        String wert2 = "Hallo";

        //Genauer Vergleich von Strings
        if (wert1.equals(wert2)) {
            System.out.println("Die beiden Strings sind gleich.");
        } else {
            System.out.println("Die beiden Strings sind ungleich.");
        }

        //Vergleich von Strings mit unterschiedlichen Groß- und Kleinschreibungen
        if (wert1.equalsIgnoreCase(wert2)) {
            System.out.println("Die beiden Strings sind gleich.");
        } else {
            System.out.println("Die beiden Strings sind ungleich.");
        }
    }
}
