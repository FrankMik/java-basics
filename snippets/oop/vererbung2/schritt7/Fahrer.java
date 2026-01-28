package oop.vererbung2.schritt7;

public class Fahrer {
    private String name;
    private int alter;

    Fahrer(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    boolean fahrErlaubniss() {
       // return alter < 18?false:true;
       return alter >= 18;
    }
}
