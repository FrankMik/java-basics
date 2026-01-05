package tag8;

public class Array_2loop {
    public static void main(String[] args) {
        int ages[] = {22, 44, 33, 18, 8, 24};
        int min = ages[0];
            for (int age : ages) {
                if (age < min) {
                min = age;
            }
        }
        System.out.println("The minimum age is: " + min);


        //--------------------------------------------------
        // Print negative numbers from an array
        int[] numbers = {2, -4, 5, 0, -5};
        for (int x : numbers) {
            if (x < 0) {
                System.out.println("Negative number: " + x);
            }
        }

        //--------------------------------------------------
        // Print positive numbers from an array
        int[] number = {2, -4, 5, 0, -5};
        for (int x : number) {
            if (x < 0) {
                continue;
            }
            System.out.println(x);
        }
    }
}
