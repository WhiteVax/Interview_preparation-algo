package ru.developer.codewars.cata_7;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Complete the function which will return the area of a circle with the given radius.
 * Returned value is expected to be accurate up to tolerance of 0.01.
 * If the radius is not positive, throw IllegalArgumentException.
 * Example:
 *
 * Circle.area(43.2673);     // returns 5881.248  (± 0.01)
 * Circle.area(68);          // returns 14526.724 (± 0.01)
 * Circle.area(0);           // throws IllegalArgumentException
 * Circle.area(-1);          // throws IllegalArgumentException
 */
public class AreaOfACircle {
    public static double area(double radius) {
        if (radius < 0.01) {
            throw new IllegalArgumentException(String.format("This radius is wrong %s.", radius));
        }
        return BigDecimal.valueOf(Math.PI * (radius * radius))
                .setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
