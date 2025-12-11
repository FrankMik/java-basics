package tag6;

public class JavaMathRandom {
    public static void main(String[] args) {
        int zufall = (int) (Math.random() * 10) + 1; // Zufallszahl zwischen 1 und 10
        int zufall2 = (int) (Math.random() * 100) + 1; // Zufallszahl zwischen 1 und 100
        int zufall3 = (int) (Math.random() * 10) ; // Zufallszahl zwischen 0 und 9
        
        System.out.println(zufall);
        System.out.println(zufall2);
        System.out.println(zufall3);
    }
}
