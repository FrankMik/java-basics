package tag3;

import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Bitte geben Sie Ihre Name ein!");
        // String name = scanner.nextLine();
        // System.out.println("Hallo, " + name + "!");

        
        System.out.println("Gib eine Zahl ein!");
        int zahl = scanner.nextInt();
        System.out.println("Multiplikation von: " + zahl + " * 5 = " + (zahl * 5));
        scanner.close();
    }
}
