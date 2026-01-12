package tag10;

public class _1_Methode {
    public static void main(String[] args) {
        meineMethode();
        sageHallo(" Max");
        checkAge(20);
        int alter = meinAlter(1988);
        System.out.println("Du bist " + alter + " Jahre alt.");
        String name = fullName("Michael", "Frank", 37);
        System.out.println("Dein voller Name ist: " + name);

    }

    public static void meineMethode() {
        System.out.println("Hello world!");
    }

    public static void sageHallo(String name) {
        System.out.println("Hallo und guten Morgen!" + name);
    }

    public static void checkAge(int age) {
        if(age > 18){
            System.out.println("Du darfst rein.");
        } else {
            System.out.println("Du darfst nicht rein.");
        }
    }

    public static int meinAlter(int geburtsjahr) {
        return 2026 - geburtsjahr;
    }

    public static String fullName(String vorname, String nachname, int alt) {
        return vorname + " " + nachname + " und du bist " + alt + " Jahre alt.";
    }
}
