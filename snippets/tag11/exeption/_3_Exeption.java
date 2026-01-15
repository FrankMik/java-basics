package tag11.exeption;

public class _3_Exeption {
    public static void main(String[] args) {
        int[] nr = {1, 2, 3};
        try {
            System.out.println(nr[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index nicht vorhanden");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("Zugrif erfolgt");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Ein anderer Fehler ist aufgetreten.");
            System.out.println(e.getMessage());
        }
    }
}
