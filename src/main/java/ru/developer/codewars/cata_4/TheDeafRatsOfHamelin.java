package ru.developer.codewars.cata_4;

import static java.util.stream.IntStream.iterate;

/**
 * Story
 * The Pied Piper has been enlisted to play his magical tune and coax all the rats out of town.
 * But some of the rats are deaf and are going the wrong way!
 * Kata Task
 * How many deaf rats are there?
 * Legend
 * P = The Pied Piper
 * O~ = Rat going left
 * ~O = Rat going right
 * Example
 * ex1 ~O~O~O~O P has 0 deaf rats
 * ex2 P O~ O~ ~O O~ has 1 deaf rat
 * ex3 ~O~O~O~OP~O~OO~ has 2 deaf rats
 */
public class TheDeafRatsOfHamelin {
    public static int countDeafRats(final String town) {
        var string = town.replace(" ", "");
        /**
         * Логика слегка бредовая, считает не пары, а позиции через 2. Такое задание.
         */
        return (int) iterate(0, i -> i < string.length(), i -> i + 2)
                .filter(i -> string.charAt(i) == 'O')
                .count();
    }
}
