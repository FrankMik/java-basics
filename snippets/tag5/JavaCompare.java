package tag5;

import java.util.Scanner;

public class JavaCompare {
    public static void main(String[] args) {
        // String a = "Apfel";
        // String b = "Aanane";

        // int result = a.compareTo(b);

        // System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe den ersten String ein: ");
        String wort1 = scanner.nextLine();
        System.out.println("Gebe den zweiten String ein: ");
        String wort2 = scanner.nextLine();
        int result = wort1.compareTo(wort2);

        if (result == 0) {
            System.out.println("Beide Wörter sind gleich.");
        } else if (result < 0) {
            System.out.println("das wort " + wort1 + " kommt vor " + wort2);
        } else {
            System.out.println("das wort " + wort2 + " kommt vor " + wort1);
        }
        scanner.close();
    }
}
