package tag11.exeption;

public class _1_Exeption {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        try {
            int r = x / y;
            // int r = y / x;
            System.out.println(r);
        } catch (ArithmeticException e) {
            // System.out.println("Division durch Null nicht erlaubt!");
            System.out.println("bei der berechnung von der fläche " + e.getMessage());
        }
    }
}
