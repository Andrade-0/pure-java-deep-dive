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

        // == PRIMITIVE AND REFERENCE TYPES == //

        // primitive: for storing simple values, int, double, float, char, boolean, long ...
        // references: for storing complex values: arrays, data, bytes, string ...
    }
}