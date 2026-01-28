package oop.vererbung2.schritt7;

public class FahrWerk {
    private String material = null;
    private String typ = null;

    FahrWerk(String material, String typ) {
        this.material = material;
        this.typ = typ;
    }

    void fahrWerk() {
        System.out.println("FahrWerk Material: " + material);
        System.out.println("FahrWerk Typ: " + typ);
    }
}
