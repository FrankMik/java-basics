package tag9;

import java.util.Arrays;
import java.util.Collections;

public class Array_Sort {
    public static void main(String[] args) {
        String[] namen = new String[5];
        namen[0] = "Zoe";
        namen[1] = "Anna";
        namen[2] = "Peter";
        namen[3] = "Max";
        namen[4] = "Lisa";

        // A-Z
        // Arrays.sort(namen);

        // Z-A
        Arrays.sort(namen, Collections.reverseOrder());

        System.out.println(Arrays.toString(namen));
    }
}
