package tag8;

public class Aufgabe_2 {
    public static void main(String[] args) {
        /*1. Du zählst deine täglichen Schritte und willst wissen, an welchem Tag du am meisten gelaufen bist.
            Tipp: Vergleiche ab dem zweiten Element mit einem Startwert aus dem Array. */
        int[] schritte = {1000, 2500, 1800, 3200, 2100};
        int maxSchritte = schritte[0];
        int maxTag = 1;
        for (int i = 1; i < schritte.length; i++) {
            if (schritte[i] > maxSchritte) {
                maxSchritte = schritte[i];
                maxTag = i + 1;
            }
        }
        System.out.println("Am meisten Schritte: Tag " + maxTag + " mit " + maxSchritte + " Schritten.");

        /*2. Du schaust auf die Temperatur der letzten Tage und willst die niedrigste Temperatur wissen.
            Tipp: length liefert die Anzahl der Plätze im Array. */
        double[] temperaturen = {15.5, 18.2, 12.8, 20.3, 14.7};
        double minTemp = temperaturen[0];
        for (int i = 1; i < temperaturen.length; i++) {
            if (temperaturen[i] < minTemp) {
                minTemp = temperaturen[i];
            }
        }
        System.out.println("Niedrigste Temperatur: " + minTemp);

        /*3. Auf deinem Einkaufszettel stehen mehrere Obstsorten. Du willst wissen, wie oft Apfel vorkommt.
            Tipp: Vergleiche Texte mit equals, nicht mit ==. */
        String[] obstSorten = {"Apfel", "Banane", "Apfel", "Orange", "Apfel"};
        int apfelAnzahl = 0;
        for (String obst : obstSorten) {
            if (obst.equals("Apfel")) {
                apfelAnzahl++;
            }
        }
        System.out.println("Anzahl Äpfel: " + apfelAnzahl);
    }
}