package tag13;

public class Schueler {
    
    static int anzahl = 0;
    String name;

    public Schueler(String name) {
        this.name = name;
        anzahl++;
    }

    public static void main(String[] args) {
        Schueler schueler1 = new Schueler("Peter");
        Schueler schueler2 = new Schueler("Otto");
        Schueler schueler3 = new Schueler("Christian");
        Schueler schueler4 = new Schueler("Sandra");
        Schueler schueler5 = new Schueler("Kevin");
        Schueler schueler6 = new Schueler("Jan");
        Schueler schueler7 = new Schueler("Seline");
        Schueler schueler8 = new Schueler("Barbara");

        System.out.println("Die Anzahl der Schüler in der Klasse: " + Schueler.anzahl);
        System.out.println("Die Namen der Schüler lautet: " + schueler1.name + ", " + schueler2.name + ", " + schueler3.name + ", " + schueler4.name + ", " + schueler5.name + ", " + schueler6.name + ", " + schueler7.name + ", " + schueler8.name);
    }
}
