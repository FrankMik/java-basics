package tag8;

public class Array_loop {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Summe: " + sum);
        
        for(String car : cars) {
            System.out.println(car);
        }
    }
}
