package tag2;

public class ZuweisungsOperatoren {
    public static void main(String[] args) {
        int n = 10;
        n += 5;  // n = n + 5 -> 15
        n -= 3;  // n = n - 3 -> 12
        n *= 2;  // n = n * 2 -> 24
        n /= 4;  // n = n / 4 -> 6
        n %= 5;  // n = n % 5 -> 1

        System.out.println(n);


        int z = 5;
        int negativ = -z; // negativ = -5

        System.out.println(negativ);


        int age = 20;
        boolean isAdult = age >= 18; // isAdult = true
        boolean hasTicket = false;
        boolean canEnter = isAdult && hasTicket; // canEnter = false
        boolean isFree = isAdult || hasTicket; // isFree = true
        
        System.out.println(isAdult);
        System.out.println(canEnter);
        System.out.println(isFree);
        
    }
}
