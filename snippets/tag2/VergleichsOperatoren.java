package tag2;

public class VergleichsOperatoren {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println(a == b);


        String name1 = "Max";
        String name2 = "Max";
        System.out.println(name1 == name2);

        String name3 = new String("Max");
        String name4 = new String("Max");
        System.out.println(name3 + "-" + name4);
        System.out.println(name3 == name4);

        System.out.println(name3.equals(name4));


        int age = 18;
        System.out.println(age >= 18);
        System.out.println(age <= 18);
        
    }
}
