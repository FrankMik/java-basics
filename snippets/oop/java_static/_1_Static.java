package oop.java_static;

public class _1_Static {
    public static void main(String[] args) {
        Besucher bs1 = new Besucher();
        Besucher bs2 = new Besucher();
        Besucher bs3 = new Besucher();
        Besucher bs4 = new Besucher();

        System.out.println(bs4.gesmt);
        System.out.println(Besucher.count);
        bs4.info();
        bs2.info();
        bs1.info();
        bs3.info();

    }
}

class Besucher {
    static int count = 0;
    int gesmt = 0;

    Besucher() {
        gesmt++;
        count++;
    }

    void info() {
        System.out.println("Hallo luis");
    }
}
