package oop.abstractAufgabe;

abstract class Animal {
    protected String name;
    protected String farbe;
    protected String rasse;
    protected int age;

    public Animal(String name,String farbe, String rasse, int age) {
        this.name = name;
        this.farbe = farbe;
        this.rasse = rasse;
        this.age = age;
    }

    public abstract void geraeusch();
    public abstract void info();
}
