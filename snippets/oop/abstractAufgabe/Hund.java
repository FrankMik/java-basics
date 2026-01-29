package oop.abstractAufgabe;

class Hund extends Animal {
    public Hund(String name,String farbe, String rasse, int age) {
        super(name,farbe, rasse, age);
    }

    public void geraeusch() {
        System.out.println("Der Hund sagt Wuff");
        System.out.println("---------------------------");
    }

    public void info() {
        System.out.println("Der Hund namens " + name + " ist " + farbe + ". Die Rasse ist " + rasse + " und er ist " + age + " Jahre.");
    }
}
