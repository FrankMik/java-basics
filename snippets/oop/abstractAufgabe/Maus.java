package oop.abstractAufgabe;

class Maus extends Animal {
    public Maus(String name,String farbe, String rasse, int age) {
        super(name,farbe, rasse, age);
    }

    public void geraeusch() {
        System.out.println("Die Maus sagt Pi");
        System.out.println("---------------------------");
    }

    public void info() {
        System.out.println("Die Maus namens " + name + " ist " + farbe + ". Sie ist " + age + " Jahre.");
    }
}
