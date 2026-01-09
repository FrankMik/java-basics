package datenbank._1_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Crud {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/personen";
        String user = "root";
        String password = "";

        Scanner scanner = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            boolean loopMenu = true;

            while (loopMenu) {
                System.out.println(ConsoleColors.GREEN + "##### Menü: #######");
                System.out.println("# 1. Create      #");
                System.out.println("# 2. Read        #");
                System.out.println("# 3. Update      #");
                System.out.println("# 4. Delete      #");
                System.out.println("# 5. Exit        #");
                System.out.println("Bitte wählen Sie eine Option (1-5): " + ConsoleColors.RESET);

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println(ConsoleColors.YELLOW + "Create" + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.YELLOW + "-------------------------" + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.YELLOW + "Gebe den Vorname ein: " + ConsoleColors.RESET);
                        String vorname = scanner.nextLine();
                        System.out.println(ConsoleColors.YELLOW + "Gebe den Nachname ein: " + ConsoleColors.RESET);
                        String nachname = scanner.nextLine();
                        System.out.println(ConsoleColors.YELLOW + "Gebe die Email ein: " + ConsoleColors.RESET);
                        String email = scanner.nextLine();
                        String insertSql = "INSERT INTO personen (vorname, nachname, email)" +
                            "VALUES ('" + vorname + "', '" + nachname + "', '" + email + "')";
                        stmt.execute(insertSql);
                        System.out.println(ConsoleColors.YELLOW + "Datensatz gespeichert!" + ConsoleColors.RESET);
                        break;
                    case 2:
                        System.out.println(ConsoleColors.BLUE + "Read" + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.BLUE + "-------------------------" + ConsoleColors.RESET);
                        ResultSet rs = stmt.executeQuery("SELECT * FROM personen");
                        System.out.println(ConsoleColors.BLUE + "ID" + ConsoleColors.RESET + " | " + ConsoleColors.BLUE + "Vorname" + ConsoleColors.RESET + " | " + ConsoleColors.BLUE + "Nachname" + ConsoleColors.RESET + " | " + ConsoleColors.BLUE + "Email" + ConsoleColors.RESET);
                        while (rs.next()) {
                            System.out.println(rs.getInt("id") + " | " +
                                               rs.getString("vorname") + " | " +
                                               rs.getString("nachname") + " | " +
                                               rs.getString("email"));
                        }
                        break;
                    case 3:
                        System.out.println(ConsoleColors.PURPLE + "Update" + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.PURPLE + "-------------------------" + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.PURPLE + "Gebe die ID des zu aktualisierenden Datensatzes ein: " + ConsoleColors.RESET);
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(ConsoleColors.PURPLE + "Gebe den neuen Vorname ein: " + ConsoleColors.RESET);
                        String newVorname = scanner.nextLine();
                        System.out.println(ConsoleColors.PURPLE + "Gebe den neuen Nachname ein: " + ConsoleColors.RESET);
                        String newNachname = scanner.nextLine();
                        System.out.println(ConsoleColors.PURPLE + "Gebe die neue Email ein: " + ConsoleColors.RESET);
                        String newEmail = scanner.nextLine();
                        String updateSql = "UPDATE personen SET vorname='" + newVorname + "', nachname='" + newNachname + "', email='" + newEmail + "' WHERE id=" + id;
                        stmt.execute(updateSql);
                        System.out.println(ConsoleColors.PURPLE + "Datensatz aktualisiert!" + ConsoleColors.RESET);
                        break;
                    case 4:
                        System.out.println(ConsoleColors.RED + "Delete" + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "-------------------------" + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + "Gebe die ID des zu löschenden Datensatzes ein: " + ConsoleColors.RESET);
                        int deleteId = scanner.nextInt();
                        scanner.nextLine();
                        String deleteSql = "DELETE FROM personen WHERE id=" + deleteId;
                        stmt.execute(deleteSql);
                        System.out.println(ConsoleColors.RED + "Datensatz gelöscht!" + ConsoleColors.RESET);
                        break;
                    case 5:
                        loopMenu = false;
                        break;
                    default:
                        System.out.println(ConsoleColors.CYAN + "Ungültige Auswahl" + ConsoleColors.RESET);
                }
            }
            stmt.close();
            con.close();
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ConsoleColors {
        public static final String RESET = "\u001B[0m";
        public static final String RED = "\u001B[31m";
        public static final String GREEN = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String BLUE = "\u001B[34m";
        public static final String PURPLE = "\u001B[35m";
        public static final String CYAN = "\u001B[36m";
}
