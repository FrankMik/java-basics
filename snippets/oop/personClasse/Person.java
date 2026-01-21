package oop.personClasse;

public class Person {
    String vname;
    String nname;

    Person(String vname, String nname) {
        this.vname = vname;
        this.nname = nname;
    }

    void begruesung() {
        System.out.println("Hallo " + vname+ " " + nname +"!");
    }
}
