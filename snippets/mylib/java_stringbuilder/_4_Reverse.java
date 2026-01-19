package mylib.java_stringbuilder;

import java.util.Scanner;

public class _4_Reverse {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Michael");
        sb1.reverse();
        System.out.println(sb1); // Output: leahciM

        System.out.println("--------------------------------");

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Bitte Wort eingeben:");
        String input = sc1.nextLine();
        StringBuilder sb2 = new StringBuilder(input);
        String umgedreht = sb2.reverse().toString();
        if (input.equals(umgedreht)) {
            System.out.println("Das eingegebene Wort ist ein Palindrom.");
        } else {
            System.out.println("Das eingegebene Wort ist kein Palindrom.");
        }
        sc1.close();
    }
}
