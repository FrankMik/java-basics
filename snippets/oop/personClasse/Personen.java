package oop.personClasse;

public class Personen {
    public static void main(String[] args) {
        Person person1 = new Person("Michael", "Frank");
        Person person2 = new Person("Stefan", "Tissot");
        person1.begruesung();
        person2.begruesung();
    }
   
}