package tag3;

import java.util.Scanner;

public class Aufgabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Passwort ein: ");
        String password = scanner.nextLine();
        if (password.length() >= 8) {
            System.out.println("Passwort ist gut genug.");
        }else {
            System.out.println("Passwort ist zu kurz! Es muss mindestens 8 zeichen haben.");
        }
        scanner.close();

    }
}
