package tag2;

public class JavaString {
    public static void main(String[] args) {
        String text = "mein Name ist Michael Frank aus Hamburg";
        System.out.println("Länge: " + text.length());

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        int x = text.indexOf("Michael");
        int y = text.lastIndexOf("Michael");
        System.out.println(x);
        System.out.println(y);

        System.out.println(text.charAt(14));

        String vergleich1 = "Michael";
        String vergleich2 = "Michael";
        System.out.println(vergleich1 == vergleich2); // true, da gleiche Referenz
        System.out.println(vergleich1.equals(vergleich2)); // true, da gleicher Inhalt


        String name123= "Michael Frank";
        System.out.println(name123.trim().length());


    }
}
