package tag9;

import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        String[] fragen = {
            "Was ist die Hauptstadt von Deutschland?",
            "Wie viele Bundesländer hat Deutschland?",
            "Welcher Fluss fließt durch Hamburg?",
            "Welches ist das größte Bundesland in Deutschland?",
            "In welchem Jahr wurde die Berliner Mauer gebaut?",
            "Wer war der erste Bundeskanzler der Bundesrepublik Deutschland?",
            "Wie viele Nachbarländer hat Deutschland?",
            "Welches deutsche Bundesland hat die meisten Einwohner?",
            "Wie heißt das deutsche Parlament?"
        };

        String[] antworten = {
            "Berlin",
            "16",
            "Elbe",
            "Bayern",
            "1961",
            "Konrad Adenauer",
            "9",
            "Nordrhein-Westfalen",
            "Bundestag"
        };

        boolean[] gefragt = {
            false, false, false, false, false,
            false, false, false, false
        };

        Scanner scanner = new Scanner(System.in);
        String userAntwort;
        int count = 0;

        Random random = new Random();

        while (count < fragen.length) {
            int zahl = random.nextInt(fragen.length);
            if (gefragt[zahl]) {
                continue;
            } 
            System.out.println(fragen[zahl]);

            userAntwort = scanner.nextLine().trim();
            if (userAntwort.equalsIgnoreCase(antworten[zahl])) {
                System.out.println("Richtig!");
                count++;
                gefragt[zahl] = true;
            } else {
                System.out.println("Falsch! Die richtige Antwort ist: " + antworten[zahl]);
            }           
        }
        scanner.close();
    }
}
