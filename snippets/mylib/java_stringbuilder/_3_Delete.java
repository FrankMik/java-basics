package mylib.java_stringbuilder;

import java.util.Scanner;

public class _3_Delete {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Programmieren");
        sb1.delete(0, 3);
        System.out.println(sb1);

        System.out.println("-------------------------------");

        StringBuilder sb2 = new StringBuilder("Michael");
        sb2.delete(3, 6);
        System.out.println(sb2);

        System.out.println("-------------------------------");

        StringBuilder sb3 = new StringBuilder("Michael");
        sb3.delete(3, 6).delete(0, 2);
        System.out.println(sb3);

        System.out.println("-------------------------------");

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Satz ein:");
        String satz = sc1.nextLine().trim();
        System.out.println("Gebe das Wort das gelöscht werden soll ein:");
        String wort = sc1.nextLine().trim();
        StringBuilder sb4 = new StringBuilder(satz);
        int start = sb4.indexOf(wort);
        int end = start + wort.length();
        if (start != -1) {
            try {
            sb4.delete(start, end);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Es ist ein Fehler aufgetreten!");
        }
        } else {
            System.out.println("Das Wort " + wort + " wurde nicht gefunden.");
        }

        sc1.close();
    }
}
