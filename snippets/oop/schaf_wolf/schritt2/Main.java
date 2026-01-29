package oop.schaf_wolf.schritt2;

// wir erstellen den Schaf
public class Main {
    public static void main(String[] args) {
        Schaf s1 = new Schaf("Dolly");
        Schaf s2 = new Schaf("Wolly");
        Schaf s3 = new Schaf("Schon");
        Schaf s4 = new Schaf("Molly");

        System.out.println(s1.getName() + s2.getName() + s3.getName() + s4.getName());
    }
}

class Schaf {
    private String name;

    public Schaf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Wolf {

}

class Herde {
    
}
