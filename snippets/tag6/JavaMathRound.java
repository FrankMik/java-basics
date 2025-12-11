package tag6;

public class JavaMathRound {
    public static void main(String[] args) {
        double num1 = 3.4; // ->3
        double num2 = 3.5; // ->4
        double num3 = 7.9; // ->8
        double num4 = -2.3; // ->-2
        double num5 = -2.5; // ->-2
        
        System.out.println(Math.round(num1));
        System.out.println(Math.round(num2));
        System.out.println(Math.round(num3));
        System.out.println(Math.round(num4));
        System.out.println(Math.round(num5));
    }
}
