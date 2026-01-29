package oop.composition;

public class Main {
    public static void main(String[] args) {
        Haus haus = new Haus();
        haus.anzeigen();
    }
}

class Haus {
    private Raum wohnZimmer;
    private Raum schlafZimmer;
    Haus() {
        wohnZimmer = new Raum("Wohnzimmer");
        schlafZimmer = new Raum("Schlafzimmer");
    }

    public void anzeigen() {
        System.out.println("Das Haus hat: ");
        System.out.println(wohnZimmer.getName() + " und " + schlafZimmer.getName());
    }
}

class Raum {
    private String name;

    public Raum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
