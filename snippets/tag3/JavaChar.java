package tag3;

import java.util.Scanner;

public class JavaChar {
    public static void main(String[] args) {
        // String wort = "Hallo, mein name ist BlaBlaBla";
        // char buchstabe = wort.charAt(3);
        // char lastChar = wort.charAt(wort.length() - 1);
        // System.out.println(lastChar);
        // System.out.println(buchstabe);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Text ein:");
        String text = scanner.nextLine().trim();
        System.out.println("Möchten Sie die erste oder die letzte Buchstabe sehen? (E/L)");
        char choice = scanner.next().trim().toUpperCase().charAt(0);
        if (choice == 'E') {
            char first = text.charAt(0);
            System.out.println("Der erste Buchstabe ist: " + first);
            return;
        }
            char last = text.charAt(text.length() - 1);
            System.out.println("Der letzte Buchstabe ist: " + last);
        
        scanner.close();
    }
}
