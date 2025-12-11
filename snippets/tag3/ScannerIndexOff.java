package tag3;

import java.util.Scanner;

public class ScannerIndexOff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("###############################");
        System.out.println("# Bitte gebe einen Text rein! #");
        System.out.println("###############################");
        String text = scanner.nextLine();
        System.out.println("######################################");
        System.out.println("# Nach welchem Wort soll ich suchen? #");
        System.out.println("######################################");
        String suchWord = scanner.nextLine();
        int position = text.indexOf(suchWord);
        if (position != -1) {
            System.out.println("Das Wort \"" + suchWord + "\" wurde an Position " + position + " gefunden.");
        } else {
            System.out.println("Das Wort \"" + suchWord + "\" wurde nicht gefunden.");
        }
        scanner.close();
    }
}
