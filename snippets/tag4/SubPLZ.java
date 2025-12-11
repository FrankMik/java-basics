package tag4;

import java.util.Scanner;

public class SubPLZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie deine Adresse ein: ");
        String adresse = scanner.nextLine();
        String plz = adresse.substring(0,5);
        System.out.println(plz);
        scanner.close();
    }
}
