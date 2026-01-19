package mylib.java_file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _1_File {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe eine Überschrift ein:");
        String input = scanner.nextLine();
        System.out.println("Schreibe einen Text: ");
        String text = scanner.nextLine();
        String html = "";
        String header = "";
        String footer = "";
        String js = "";

        try {
            FileWriter flwriter = new FileWriter("snippets\\mylib\\java_file\\index.html");

            header += "<!DOCTYPE html>";
            header += "<html lang=\"en\">";
            header += "<head>";
            header += "<meta charset=\"UTF-8\">";
            header += "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">";
            header += "<title>Document</title>";
            header += "</head>";
            header += "<body>";

            footer += "</body>";
            footer += "</html>";

            js += "<script>alert(\"Welcome to my page\");</script>";

            html += header;
            html += "<h1>" + input + "</h1>";
            html += "<p>" + text + "</p>";
            html += js;
            html += footer;

            flwriter.write(html);

            flwriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
