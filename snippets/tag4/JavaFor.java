package tag4;

public class JavaFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("-- gerade Zahlen --");
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("-- addition --");
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum: " + sum);

        System.out.println("-- countdown --");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}
