package oop.schaf_wolf.schritt4;

import java.util.ArrayList;
import java.util.Random;

// wir erstellen den Wolf
public class Main {
    public static void main(String[] args) {
        Schaf s1 = new Schaf("Dolly");
        Schaf s2 = new Schaf("Wolly");
        Schaf s3 = new Schaf("Schon");
        Schaf s4 = new Schaf("Molly");

        Herde herde = new Herde();
        herde.schafHinzufugen(s1);
        herde.schafHinzufugen(s2);
        herde.schafHinzufugen(s3);
        herde.schafHinzufugen(s4);
        herde.zeigeHerde();

        Wolf boeseWolf = new Wolf("Stefan");
        boeseWolf.attackiere(herde);

        herde.zeigeHerde();

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
    private String name;
    Random zufall = new Random();

    public Wolf(String name) {
        this.name = name;
    }

    public void attackiere(Herde herde1) {
        
        int schafIndex = zufall.nextInt(herde1.anzahlSchafe());
        herde1.schafEntfernen(schafIndex);
        Schaf opfer = herde1.schafList.get(schafIndex);
        System.out.println("wolf " + name + " hat das Schaf " + opfer.getName() + " gefressen");
    }

}

class Herde {
    ArrayList<Schaf> schafList = new ArrayList<Schaf>();

    public void schafHinzufugen(Schaf neuSchaf) {
        schafList.add(neuSchaf);
    }

    public void zeigeHerde() {
        if (schafList.size() == 0) {
            System.out.println("Die Herde ist leer");
        } else {
            for(Schaf schaf : schafList) {
                System.out.println(schaf.getName() + " macht mäh");
            }
        }
    }

    public int anzahlSchafe() {
        return schafList.size();
    }

    public void schafEntfernen(int ind) {
        schafList.remove(ind);
    }
}
