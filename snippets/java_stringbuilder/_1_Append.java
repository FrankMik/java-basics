package java_stringbuilder;

public class _1_Append {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hi");
        sb1.append("!");
        System.out.println(sb1.toString()); // Explicitly calling toString()
        System.out.println(sb1); // toString() is called automatically

        StringBuilder test =sb1.append("A").append("B").append("C");
        test.append(" Ende");
        System.out.println(test);
        
        //--------------------------------------------------------------

        StringBuilder sb2 = new StringBuilder();
        for (int i = 1; i <= 3; i++) {
            sb2.append("Loop: " + i + "\n");
        }
        System.out.println(sb2);
    }
}
