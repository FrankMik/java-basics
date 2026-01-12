package datenbank._1_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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
                showMenu();

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        createPerson(stmt, scanner);
                        break;
                    case 2:
                        readTable(stmt);
                        break;
                    case 3:
                        updatePerson(stmt, scanner);
                        break;
                    case 4:
                        deletePerson(stmt, scanner);
                        break;
                    case 5:
                        loopMenu = false;
                        break;
                    default:
                        System.out.println(Col.CYAN + "Ungültige Auswahl" + Col.RESET);
                }
            }
            stmt.close();
            con.close();
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showMenu() {
        System.out.println(Col.GREEN + "##### Menü: #######");
                System.out.println("# 1. Create      #");
                System.out.println("# 2. Read        #");
                System.out.println("# 3. Update      #");
                System.out.println("# 4. Delete      #");
                System.out.println("# 5. Exit        #");
                System.out.println("Bitte wählen Sie eine Option (1-5): " + Col.RESET);
    }

    public static void createPerson(Statement stmt, Scanner scanner) throws SQLException {
        System.out.println(Col.YELLOW + "Create" + Col.RESET);
                        System.out.println(Col.YELLOW + "-------------------------" + Col.RESET);
                        System.out.println(Col.YELLOW + "Gebe den Vorname ein: " + Col.RESET);
                        String vorname = scanner.nextLine();
                        System.out.println(Col.YELLOW + "Gebe den Nachname ein: " + Col.RESET);
                        String nachname = scanner.nextLine();
                        System.out.println(Col.YELLOW + "Gebe die Email ein: " + Col.RESET);
                        String email = scanner.nextLine();
                        System.out.println(Col.YELLOW + "Gebe die Telefonnummer ein: " + Col.RESET);
                        String telefon = scanner.nextLine();
                        System.out.println(Col.YELLOW + "Gebe die URL ein: " + Col.RESET);
                        String urlPer = scanner.nextLine();
                        String insertSql = "INSERT INTO personen (vorname, nachname, email, telefon, urlPer)" +
                            "VALUES ('" + vorname + "', '" + nachname + "', '" + email + "', '" + telefon + "', '" + urlPer + "')";
                        stmt.execute(insertSql);
                        System.out.println(Col.YELLOW + "Datensatz gespeichert!" + Col.RESET);
    }

    public static void readTable(Statement stmt) throws SQLException {
        System.out.println(Col.BLUE + "Read" + Col.RESET);
                        System.out.println(Col.BLUE + "------------------------------------------------------------------------------------------------" + Col.RESET);
                        ResultSet rs = stmt.executeQuery("SELECT * FROM personen");
                        System.out.printf(Col.BLUE + "%-2s | %-15s | %-15s | %-25s | %-15s | %-25s%n" + Col.RESET, "ID", "Vorname", "Nachname", "Email", "Telefon", "URL");
                        System.out.println(Col.BLUE + "------------------------------------------------------------------------------------------------" + Col.RESET);
                        while (rs.next()) {
                            System.out.printf(Col.BLUE + "%-2s | %-15s | %-15s | %-25s | %-15s | %-25s%n" + Col.RESET,
                                              rs.getInt("id"),
                                              rs.getString("vorname"),
                                              rs.getString("nachname"),
                                              rs.getString("email"),
                                              rs.getString("telefon"),
                                              rs.getString("urlPer"));
                        }
    }

    public static void updatePerson(Statement stmt, Scanner scanner) throws SQLException {
        System.out.println(Col.PURPLE + "Update" + Col.RESET);
                        System.out.println(Col.PURPLE + "-------------------------" + Col.RESET);
                        System.out.println(Col.PURPLE + "Gebe die ID des zu aktualisierenden Datensatzes ein: " + Col.RESET);
                        int updateId = scanner.nextInt();
                            scanner.nextLine();

                        boolean subLoop = true;
                        while (subLoop) {
                            showSubMenu();
                            
                            int updateChoice = scanner.nextInt();
                            scanner.nextLine();

                            switch (updateChoice) {
                                case 1:{  
                                    System.out.println(Col.PURPLE + "Gebe den neuen Vorname ein: " + Col.RESET);
                                    String newVorname = scanner.nextLine();
                                    String updateVor = "UPDATE personen SET vorname='" + newVorname + "' WHERE id=" + updateId;
                                    stmt.executeUpdate(updateVor);
                                    System.out.println(Col.PURPLE + "Datensatz aktualisiert!" + Col.RESET);
                                    break;
                                }
                                case 2:{
                                    System.out.println(Col.PURPLE + "Gebe den neuen Nachname ein: " + Col.RESET);
                                    String newNachname = scanner.nextLine();
                                    String updateNach = "UPDATE personen SET nachname='" + newNachname + "' WHERE id=" + updateId;
                                    stmt.executeUpdate(updateNach);
                                    System.out.println(Col.PURPLE + "Datensatz aktualisiert!" + Col.RESET);
                                    break;
                                }
                                case 3:{
                                    System.out.println(Col.PURPLE + "Gebe die neue Email ein: " + Col.RESET);
                                    String newEmail = scanner.nextLine();
                                    String updateEmail = "UPDATE personen SET email='" + newEmail + "' WHERE id=" + updateId;
                                    stmt.executeUpdate(updateEmail);
                                    System.out.println(Col.PURPLE + "Datensatz aktualisiert!" + Col.RESET);
                                    break;
                                }
                                case 4:{
                                    System.out.println(Col.PURPLE + "Gebe die neue Telefonnummer ein: " + Col.RESET);
                                    String newTelefon = scanner.nextLine();
                                    String updateTel = "UPDATE personen SET telefon='" + newTelefon + "' WHERE id=" + updateId;
                                    stmt.executeUpdate(updateTel);
                                    System.out.println(Col.PURPLE + "Datensatz aktualisiert!" + Col.RESET);
                                    break;
                                }
                                case 5:{
                                    System.out.println(Col.PURPLE + "Gebe die neue URL ein: " + Col.RESET);
                                    String newUrlPer = scanner.nextLine();
                                    String updateUrl = "UPDATE personen SET urlPer='" + newUrlPer + "' WHERE id=" + updateId;
                                    stmt.executeUpdate(updateUrl);
                                    System.out.println(Col.PURPLE + "Datensatz aktualisiert!" + Col.RESET);
                                    break;
                                }
                                case 6:{
                                    System.out.println(Col.PURPLE + "Gebe den neuen Vorname ein: " + Col.RESET);
                                    String newVorname = scanner.nextLine();
                                    System.out.println(Col.PURPLE + "Gebe den neuen Nachname ein: " + Col.RESET);
                                    String newNachname = scanner.nextLine();
                                    System.out.println(Col.PURPLE + "Gebe die neue Email ein: " + Col.RESET);
                                    String newEmail = scanner.nextLine();
                                    System.out.println(Col.PURPLE + "Gebe die neue Telefonnummer ein: " + Col.RESET);
                                    String newTelefon = scanner.nextLine();
                                    System.out.println(Col.PURPLE + "Gebe die neue URL ein: " + Col.RESET);
                                    String newUrlPer = scanner.nextLine();
                                    String updateSql = "UPDATE personen SET vorname='" + newVorname + "', nachname='" + newNachname + "', email='" + newEmail + "', telefon='" + newTelefon + "', urlPer='" + newUrlPer + "' WHERE id=" + updateId;
                                    stmt.executeUpdate(updateSql);
                                    System.out.println(Col.PURPLE + "Datensatz aktualisiert!" + Col.RESET);
                                    break;
                                }
                                case 7:{
                                    subLoop = false;
                                    break;
                                }
                                default:
                                    System.out.println(Col.PURPLE + "Ungültige Eingabe!" + Col.RESET);
                            }
                        }
                        
    }

    public static void deletePerson(Statement stmt, Scanner scanner) throws SQLException {
        System.out.println(Col.RED + "Delete" + Col.RESET);
                        System.out.println(Col.RED + "-------------------------" + Col.RESET);
                        System.out.println(Col.RED + "Gebe die ID des zu löschenden Datensatzes ein: " + Col.RESET);
                        int deleteId = scanner.nextInt();
                        scanner.nextLine();
                        String deleteSql = "DELETE FROM personen WHERE id=" + deleteId;
                        stmt.execute(deleteSql);
                        System.out.println(Col.RED + "Datensatz gelöscht!" + Col.RESET);
    }

    public static void showSubMenu() {
        System.out.println(Col.GREEN + "##### Was möchtest du ändern? #######");
                System.out.println("# 1. Vorname                        #");
                System.out.println("# 2. Nachname                       #");
                System.out.println("# 3. Email                          #");
                System.out.println("# 4. Telefon                        #");
                System.out.println("# 5. URL                            #");
                System.out.println("# 6. Alles                          #");
                System.out.println("# 7. Exit                           #");
                System.out.println("Bitte wählen Sie eine Option (1-7): " + Col.RESET);
    }
}

class Col {
        public static final String RESET = "\u001B[0m";
        public static final String RED = "\u001B[31m";
        public static final String GREEN = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String BLUE = "\u001B[34m";
        public static final String PURPLE = "\u001B[35m";
        public static final String CYAN = "\u001B[36m";
}
