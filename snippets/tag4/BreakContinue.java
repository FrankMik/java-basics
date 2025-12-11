package tag4;

public class BreakContinue {
    public static void main(String[] args) {

        // Wir iterieren durch Zahlen von 1 bis 10.

        for (int i = 1; i <= 10; i++) {

            // Bedingung: Wenn die Zahl gerade ist (d.h. der Rest bei Division durch 2 ist 0),

            // überspringen wir den Rest des Schleifenkörpers für diese Iteration.

            if (i % 2 == 0) {

                // Das 'continue' springt direkt zur nächsten Iteration (i wird erhöht).

                continue; 

            }

            // Dieser Code wird NUR für UNGERADE Zahlen ausgeführt.

            System.out.println("Aktuelle ungerade Zahl: " + i);

        }

        System.out.println("\nSchleife beendet.");

    }

}
