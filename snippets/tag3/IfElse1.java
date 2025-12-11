package tag3;

public class IfElse1 {
    public static void main(String[] args) {
        if (20 > 10) {
            System.out.println("20 ist Größer");
        }

        if (20 > 10) 
            System.out.println("20 ist Größer");
        System.out.println("Diese Zeile wird immer ausgeführt!");

        System.out.println("--------- if else ----------");
        boolean isAdmin = true;
        if (isAdmin) {
            System.out.println("Ich bin Admin!");
        } else {
            System.out.println("Ich bin ein User!");
        }


        System.out.println("--------- if els verschachtelt ----------");
        int x = 15;
        int y = 25;

        if (x > 10) {
            System.out.println("x ist größer als 10");
         
        if (y > 20) {
            System.out.println("y ist größer als 20");
        }
    }
        System.out.println("---------- logische Operatoren in bedingungen && ---------");

        int a = 200;
        int b = 330;
        int c = 450;
        if (a > b && c < a) {
            System.out.println("Alles gleich groß");
        }

        System.out.println("---------- logische Operatoren in bedingungen || ---------");

        if (a > b || a > c) {
            System.out.println("Alles ist gleich groß!");
        }

        System.out.println("---------- logische Operatoren in bedingungen ! ---------");
        if (!(b > a)) {
            System.out.println("b ist gröser als a");
        }

        System.out.println("---------- if else if else ---------");

        int temp = 30;
        if (temp < 0) {
            System.out.println("Es ist sehr kalt!");
        } else if (temp < 15) {
            System.out.println("Es ist kalt!");
        } else if (temp < 25) {
            System.out.println("Es ist warm!");
        } else {
            System.out.println("Es ist heiß!");
        }
        
    }
}
