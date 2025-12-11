package tag1;

public class TypeCasting {
    public static void main(String[] args) {
        //Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        //Narrowing Casting
        double myDouble1 = 8.88d;
        int myInt1 = (int) myDouble1; // Manual casting: double to int

        System.out.println(myDouble); 
        System.out.println(myInt1);   
        
    }
}
