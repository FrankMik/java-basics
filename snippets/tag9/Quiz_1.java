package tag9;

import java.util.Random;
import java.util.Scanner;

public class Quiz_1 {
    public static void main(String[] args) {

        Frage[] fragen = {
            new Frage("Was ist die Hauptstadt von Deutschland?", "Berlin", false),
            new Frage("Wie viele Bundesländer hat Deutschland?", "16", false),
            new Frage("Welcher Fluss fließt durch Hamburg?", "Elbe", false),
            new Frage("Welches ist das größte Bundesland in Deutschland?", "Bayern", false),
            new Frage("In welchem Jahr wurde die Berliner Mauer gebaut?", "1961", false),
            new Frage("Wer war der erste Bundeskanzler der Bundesrepublik Deutschland?", "Konrad Adenauer", false),
            new Frage("Wie viele Nachbarländer hat Deutschland?", "9", false),
            new Frage("Welches deutsche Bundesland hat die meisten Einwohner?", "Nordrhein-Westfalen", false),
            new Frage("Wie heißt das deutsche Parlament?", "Bundestag", false)
        };
       
        Scanner scanner = new Scanner(System.in);
        String userAntwort;
        int count = 0;
        int versuche = 0;

        Random random = new Random();

        while (count < fragen.length) {
            int index = random.nextInt(fragen.length);
            if (fragen[index].asked) {
                continue;
            } 
            System.out.println(fragen[index].question);

            userAntwort = scanner.nextLine().trim();
            if (userAntwort.equalsIgnoreCase(fragen[index].answer.trim())) {
                System.out.println(ConsoleColors.GREEN + "Richtig!" + ConsoleColors.RESET);
                count++;
                fragen[index].asked = true;
            } else {
                System.out.println(ConsoleColors.RED + "Falsch! Die richtige Antwort ist: " + fragen[index].answer + ConsoleColors.RESET);
            }          
            versuche++; 
        }
        System.out.println(ConsoleColors.GREEN + "Quiz beendet! Du hast alle Fragen beantwortet." + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "Für " + ConsoleColors.RESET + fragen.length + ConsoleColors.GREEN + " Fragen hast du " + ConsoleColors.RESET + versuche + ConsoleColors.GREEN + " Versuche gebraucht." + ConsoleColors.RESET);
        scanner.close();
    }
}

class Frage {
    String question;
    String answer;
    boolean asked;
    public Frage(String question, String answer, boolean asked) {
        this.question = question;
        this.answer = answer;
        this.asked = false;
    }
}

class ConsoleColors {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
}
