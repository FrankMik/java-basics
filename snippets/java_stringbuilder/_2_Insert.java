package java_stringbuilder;

import java.util.Scanner;

public class _2_Insert {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Stefan");
        // Michael
        // 012345

        sb1.insert(0, "A");
        // AMichael
        // 0123456
        System.out.println(sb1);
        sb1.insert(5, "x");
        // AMichxel
        // 01234567
        System.out.println(sb1);

        // ----------------------------------------------------------------------------

        StringBuilder ab2 = new StringBuilder("Ich lerne Programmieren");
        ab2.insert(10, "Java ");
        System.out.println(ab2);
        // ----------------------------------------------------------------------------

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Vornamen eingeben:");
        String vorname = sc.nextLine();
        System.out.println("Bitte Nachnamen eingeben:");
        String nachname = sc.nextLine();
        StringBuilder sb3 = new StringBuilder(nachname);
        sb3.insert(0, vorname + " ");
        System.out.println("Voller Name:" + sb3);
        sc.close();
    }
}
