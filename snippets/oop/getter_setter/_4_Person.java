package oop.getter_setter;

public class _4_Person {
    public static void main(String[] args) {
        Person per1 = new Person();
       per1.setVname("Peter");
       per1.setNname("Mustermann");

       per1.sagHallo();
    }
}

class Person {
    private String vname;
    private String nname;

    public String getVname() {
        return vname;
    }

    public String getNname() {
        return nname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public void sagHallo() {
        System.out.println("hallo " + vname + " " + nname);
    }
}
