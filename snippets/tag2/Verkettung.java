package tag2;

public class Verkettung {
    public static void main(String[] args) {
        String vorName = "Michael";
        String nachName = "Frank";
        String leerZeichen = " ";

        System.out.println("Mein Name ist " + vorName + " " + nachName + ".");

        System.out.println(vorName.concat(leerZeichen).concat(nachName));

        String zahl1 = "10";
        int zahl2 = 10;
        System.out.println(zahl1 + zahl2); // Verkettung

        String text = "Sein Name\b ist: \"Stefan Tissot\"\nund wohnt in Mölln\n\tTel:0215487321\n\tFax:326598789.";
        System.out.println(text);

    }
}
