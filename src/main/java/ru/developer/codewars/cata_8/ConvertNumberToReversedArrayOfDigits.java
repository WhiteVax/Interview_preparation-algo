package ru.developer.codewars.cata_8;

/**
 * Convert number to reversed array of digits
 * Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
 * Example(Input => Output):
 * <p>
 * 35231 => [1,3,2,5,3]
 * 0 => [0]
 */
public class ConvertNumberToReversedArrayOfDigits {

    public static int[] digitize(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
