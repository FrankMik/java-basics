package tag2;

public class Prio {
    public static void main(String[] args) {
        int pakete = 3;
        int preisProPaket = 5;
        int service = 20;

        int preis1 = service + pakete * preisProPaket;
        int preis2 = (service + pakete) * preisProPaket;

        System.out.println(preis1);
        System.out.println(preis2);
    }
}
