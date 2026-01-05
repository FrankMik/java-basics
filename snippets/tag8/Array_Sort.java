package tag8;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sort {
    public static void main(String[] args) {
        // int[] zahlen = {5, 2, 7, 99, 11};

        // Arrays.sort(zahlen);
        // System.out.println(Arrays.toString(zahlen)); // Ausgabe: [2, 5, 7, 11, 99]

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib 3 Noten ein:");
        int[] noten = new int[3];
        for (int i = 0; i < noten.length; i++) {
            noten[i] = scanner.nextInt();
        }
        Arrays.sort(noten);

        System.out.println(Arrays.toString(noten));

        scanner.close();
    }
}
