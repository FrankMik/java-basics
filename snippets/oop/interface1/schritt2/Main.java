package oop.interface1.schritt2;

public class Main {
    public static void main(String[] args) {
        // unsauberer code
        // FreundlicherBegruesser begr = new FreundlicherBegruesser();
        // begr.greet("Michael");

        // sauberer code
        Begruesser begr = new FreundlicherBegruesser();
        begr.greet("Michael");
    }
}

interface Begruesser {
    void greet(String name);
}

class FreundlicherBegruesser implements Begruesser {
    public void greet(String name) {
        System.out.println("Hallo, " + name + "!");
    }
}
