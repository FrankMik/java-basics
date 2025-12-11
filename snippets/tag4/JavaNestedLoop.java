package tag4;

public class JavaNestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer (Äusere schleife) loop iteration: " + i);
           for (int x = 1; x <= 3; x++) {
                System.out.println("  Inner (Innere schleife) loop iteration: " + x);
           }
        }

        System.out.println("----------- Multiplikations Tabelle ------------");
        for (int i = 1; i <= 10; i++) {
            for (int x = 1; x <= 10; x++) {
                System.out.printf(i * x + " ");
            }
            System.out.println("\n");
        }
    }
}
