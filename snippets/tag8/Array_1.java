package tag8;

public class Array_1 {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel"; // Überschreiben des ersten Elements im Array
        System.out.println(cars[0]);
        System.out.println(cars.length);


        String[] namen = new String[4];
        namen[0] = "Max";
        namen[1] = "Moritz";
        namen[2] = "Anna";
        namen[3] = "Lisa";
        System.out.println(namen[1]);
        System.out.println(namen[1].length());
    }
}
