package oop.filmClasse;

public class Film {
    String titel;
    String genre;

    void beschreibung() {
        System.out.println("Film ist " + titel + ", Genre: " + genre + " blablabla");
    }
    public static void main(String[] args) {
        Film film1 = new Film();
        film1.titel = "Misteri X";
        film1.genre = "Action";

        film1.beschreibung();
    }
}
