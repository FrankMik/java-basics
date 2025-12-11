package tag3;

import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Text ein:");
        String text = scanner.nextLine().trim();
        char last = text.charAt(text.length() - 1);
        if (last == '.') {
            System.out.println("Der Satz endet korrekt mit einem Punkt.");
        }
        else {
            System.out.println("Der Satz endet NICHT mit einem Punkt.");
        }
        scanner.close();
    }
}
