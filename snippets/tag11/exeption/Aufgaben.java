package tag11.exeption;

public class Aufgaben {
    public static void main(String[] args) {
        /* 1. Du willst zwei ganze Zahlen teilen. 
        Wenn die zweite Zahl 0 ist, soll eine freundliche Meldung kommen statt eines Absturzes.
        (ArithmeticException e) */
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Ergebnis: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Fehler: Division durch Null ist nicht erlaubt.");
            System.out.println(e.getMessage());
        }

        /* 2. Du bekommst eine Zahl als Text.
        Wenn der Text falsch ist, soll eine verständliche Meldung erscheinen.
        (NumberFormatException e) */
        try {
            String text = "12a";
            int number = Integer.parseInt(text);
            System.out.println("Die Zahl ist: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Fehler: Der Text ist keine gültige Zahl.");
            System.out.println(e.getMessage());
        }

        /* 3. Ein Name wurde noch nicht gesetzt.
        Beim Lesen der Länge soll eine verständliche Meldung erscheinen.
        (NullPointerException e) */
        try {
            String name = null;
            System.out.println("Die Länge des Namens ist: " + name.length());
        } catch (NullPointerException e) {
            System.out.println("Fehler: Der Name wurde nicht gesetzt.");
            System.out.println(e.getMessage());
        }

        /* 4.f Du teilst zwei ganze Zahlen. Die zweite Zahl könnte 0 sein.
        Gib eine verständliche Meldung aus egal ob fehler oder nicht ;).
        (ArithmeticException e) finally */
        int x = 10;
        int y = 0;
        try {
            int result = x / y;
            System.out.println("Ergebnis: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Fehler: Division durch Null ist nicht erlaubt.");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Berechnung abgeschlossen.");
        }

        /* 5.f Du hast Text, der eine Zahl sein soll.
            Wandle ihn in eine Zahl um und reagiere freundlich, wenn der Text nicht passt.
            (NumberFormatException e)
            Tipp: Probiere verschiedene Texte (z. B. “123” und “12a”) aus.
            int n = Integer.parseInt(text);
            finally */
        String text = "12a";
        try {
            int number = Integer.parseInt(text);
            System.out.println("Die Zahl ist: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Fehler: Der Text ist keine gültige Zahl.");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Zahlenumwandlung abgeschlossen.");
        }
    }
}
