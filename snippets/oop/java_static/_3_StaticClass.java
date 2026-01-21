package oop.java_static;

public class _3_StaticClass {
    public static void main(String[] args) {
        int b = Outer.Inner.addieren(2, 5);
        System.out.println(b);
    }
}

class Outer {
    static class Inner {
        public static int addieren(int a, int b) {
            return a + b;
        }
    }
}
