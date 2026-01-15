package tag11.exeption;

public class _2_Exeption {
    public static void main(String[] args) {
        int[] nr = { 1, 2, 3 };

        try {
            System.out.println(nr[1]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // wird immer ausgeführt egal welches ergebniss
        } finally {
            System.out.println("Zugriff erfolgt!");
        }
    }
}
