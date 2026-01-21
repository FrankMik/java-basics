package oop.filmClasse;

public class Film1 {

    String titel;
    String genre;

    void vorschau() {
        System.out.println("Der Film: " + titel + " ist " + genre);
    }

    public Film1(String titel, String genre) {
        this.genre = genre;
        this.titel = titel;
    }
    public static void main(String[] args) {
        Film1 kino = new Film1("Mister Bin", "Comedy");
        Film1 film = new Film1("Cars", "Kinderfilm");

        kino.vorschau();
        film.vorschau();
    }
}
