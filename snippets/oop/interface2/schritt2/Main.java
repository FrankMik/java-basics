package oop.interface2.schritt2;

public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.aufladbar();
        phone.internetVerbindung("WLAN");
    }
}

interface Aufladbar {
    void aufladbar();
}

interface HatInternet {
    void internetVerbindung(String internet);
}

class Smartphone implements Aufladbar, HatInternet {
    public void aufladbar() {
        System.out.println("Smartphone lädt...");
    }

    public void internetVerbindung(String internet) {
        System.out.println("Verbunden mit " + internet);
    }
}
