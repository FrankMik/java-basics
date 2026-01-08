package tag9;

import java.util.Arrays;

public class Array_Copy {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = Arrays.copyOf(original, 2);

        System.out.println(Arrays.toString(copy));
    }
}
