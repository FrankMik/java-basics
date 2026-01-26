package oop.vererbung.aufgabe;

public class Main {
    public static void main(String[] args) {
        Hund hund1 = new Hund("Bello", 3);
        Katze katze1 = new Katze("Kiti", 1);
        hund1.info();
        katze1.info();
        
    }
}

class Tier {
    private String name;
    private int age;

    Tier(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void info() {
        System.out.println("Ich heiße " + name + " und ich bin " + age + " Jahre alt.");
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

}

class Hund extends Tier {
    Hund(String name, int age) {
        super(name, age);
    }

    void info() {
        System.out.println("Ich bin ein Hund und ich heiße: " + getName() + " und ich bin "+ getAge() + "Jahre alt");
    }
}

class Katze extends Tier {
    Katze(String name, int age) {
        super(name, age);
    }

    void info() {
        System.out.println("Ich bin eine Katze und ich heiße: " + getName() + " und ich bin "+ getAge() + "Jahre alt");
    }
}