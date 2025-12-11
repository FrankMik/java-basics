package tag2;

public class LogischeOperatoren {
    public static void main(String[] args) {
        boolean isLoggedin = true;
        boolean isAdmin = false;

        System.out.println("Ich bin User: " + (isLoggedin && !isAdmin));
        System.out.println("Habe zugriff: " + (isLoggedin || isAdmin));
        System.out.println("Nicht eingeloggt: " + !isLoggedin);
    }
}
