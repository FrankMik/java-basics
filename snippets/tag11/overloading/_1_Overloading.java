package tag11.overloading;

public class _1_Overloading {
    public static void main(String[] args) {
        int erg = add(5, 10);
        System.out.println(erg);

        double erg2 = add(5.5, 10.2);
        System.out.println(erg2);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}
