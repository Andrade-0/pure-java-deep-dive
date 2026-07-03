package ao.morgado;

import java.awt.*;
import java.awt.geom.Point2D;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        byte x = 2;
        byte y = x;
        x = 5;
        System.out.println("X.value: "+ x);
        System.out.println("Y.value: "+ y);

        Point2D.Double coords = new Point2D.Double(8.9535306, 13.197475); // Point2D.Double is used to storing decimals values as coords geog
        Point point1 = new Point(2, 3); // Point:is used only to storing integers numbers. use-case: GUI (cursor position in pixels)

        coords.y = 12.212121;
        point1.x = 12;

        System.out.println("Latitude: "+ coords.getX());
        System.out.println("Longitude: "+ coords.getY());

        // String address = new String("Luanda, Angola"); // -> its redudant beacause java has defined spacial handling for this class, posted below
        String fullName = "Morgado Melo";

        System.out.println("Full name: "+ fullName);

        String randomWord = "morgado@selenium.ao";
        System.out.println(randomWord.endsWith("morgado")); // return true or false - this method verify if a work ends with some value defined
        // other methods; startsWith("")

        String identificationType = randomWord.contains("@")
                ? "email"
                : "phone-number";
        System.out.println("Identification Type: "+ identificationType);

        System.out.println(randomWord.substring(3)); // show letters after of first x caracters

        System.out.println("morgado".compareTo("morgab")); // returns: 0 - same text, ...

        // ". dot" is used as member access operator to access members from objects or classes

        // == PRIMITIVE AND REFERENCE TYPES == //

        // primitive: for storing simple values, int, double, float, char, boolean, long ...
        // references: for storing complex values: arrays, data, bytes, string ...
    }
}