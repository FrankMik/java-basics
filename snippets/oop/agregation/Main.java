package oop.agregation;

// ganz normale Agregation
public class Main {
    public static void main(String[] args) {
        Tier katze = new Tier("Katze");
        Tier hund = new Tier("Hund");
 
        katze.frisst(new Futter("Wiskas"));
        hund.frisst(new Futter("Chappy"));
    }
}

class Tier {
    private String name;

    Tier(String name) {
        this.name = name;
    }

    public void frisst(Futter futter) {
        System.out.println(name + " frissst " + futter.getName());
    }
}

class Futter {
    private String name;

    Futter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}