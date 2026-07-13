package ao.morgado;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // PrintWriter

        byte[] buffer = "Hello".getBytes(StandardCharsets.UTF_8);
        System.out.println("hello in bytes: "+ buffer.toString());

        PrintWriter pw = new PrintWriter("users.txt");
        pw.println("Test");
        pw.close();

        PrintWriter pw2 = new PrintWriter("report.txt");
        pw2.println("Sales Report");
        pw2.println("----------------");
        pw2.println("Total Sales: 5000");
        pw2.close();

        PrintWriter writer = new PrintWriter("employees.csv");
        writer.println("Name,Age,Salary");
        writer.println("John,25,1500");
        writer.println("Alice,30,2500");
        writer.println("Morgan,18,2008");
        writer.checkError();
        writer.close();

        PrintWriter pw3 = new PrintWriter(System.out);
        pw3.println("John,25,1500");
        pw3.close();

        FileOutputStream fos = new FileOutputStream("file_.txt");
        fos.write("Hello".getBytes());
        fos.close();
    }
}