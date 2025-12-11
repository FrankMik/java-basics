package tag6;

import java.util.Random;

public class JavaClassRandNextInt {
    public static void main(String[] args) {
        Random rand = new Random();
        int zahl = rand.nextInt(10); // Zufallszahl zwischen 0 und 9
        System.out.println(zahl);
    }
}
