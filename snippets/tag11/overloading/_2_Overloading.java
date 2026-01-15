package tag11.overloading;

public class _2_Overloading {
    public static void main(String[] args) {
        begruessung();
        begruessung("Hans");
        begruessung("Hans", "Muster");
    }

    static void begruessung() {
        System.out.println("Hallo und guten Morgen!");
    }

    static void begruessung(String vname) {
        System.out.println("Hallo " + vname + " und guten Morgen!");
    }

    static void begruessung(String vname, String nname) {
        System.out.println("Hallo " + vname + " " + nname + " und guten Morgen!");
    }
}
