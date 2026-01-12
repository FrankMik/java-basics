package tag10;

public class Wrapper1 {
    public static void main(String[] args) {
        int zahl1 = 0;
        Integer zahl2 = 5;
        String neueZahl2 = zahl2.toString();

        System.out.println(zahl1);
        System.out.println(neueZahl2.length());

        int i = Integer.parseInt(neueZahl2);
        System.out.println(i);
        
        double d = Double.parseDouble("3.15");
        System.out.println(d);

        boolean b = Boolean.parseBoolean("true");
        if (b) {
            System.out.println("Wahr");
        } else {
            System.out.println("Falsch");
        }
    }
}
