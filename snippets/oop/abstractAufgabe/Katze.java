package oop.abstractAufgabe;

class Katze extends Animal {
    public Katze(String name,String farbe, String rasse, int age) {
        super(name,farbe, rasse, age);
    }

    public void geraeusch() {
        System.out.println("Die katze sagt Miau");
        System.out.println("---------------------------");
    }

    public void info() {
        System.out.println("Die Katze namens " + name + " ist " + farbe + ". Die Rasse ist " + rasse + " und sie ist " + age + " Jahre.");
    }
}
