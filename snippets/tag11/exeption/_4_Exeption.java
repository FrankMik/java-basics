package tag11.exeption;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _4_Exeption {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("snippets\\tag11\\exeption\\test.txt");
            
            file.write("Hallo Welt".getBytes()); 
            file.close();
            String reader = Files.readString(Path.of("snippets\\tag11\\exeption\\test.txt"));
            System.out.println("Datei erfolgreich geschrieben.");
            System.out.println("--------------------------------");
            System.out.println(reader);
        } catch (IOException e) {
            System.out.println("Fehler beim Schreiben: " + e.getMessage());
        }
    }
}
