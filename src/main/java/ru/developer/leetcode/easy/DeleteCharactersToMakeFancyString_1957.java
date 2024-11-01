package ru.developer.leetcode.easy;

/**
 * A fancy string is a string where no three consecutive characters are equal.
 * Given a string s, delete the minimum possible number of characters from s to make it fancy.
 * Return the final string after the deletion. It can be shown that the answer will always be unique.
 *
 * Example 1:
 *
 * Input: s = "leeetcode"
 * Output: "leetcode"
 * Explanation:
 * Remove an 'e' from the first group of 'e's to create "leetcode".
 * No three consecutive characters are equal, so return "leetcode".
 * Example 2:
 *
 * Input: s = "aaabaaaa"
 * Output: "aabaa"
 * Explanation:
 * Remove an 'a' from the first group of 'a's to create "aabaaaa".
 * Remove two 'a's from the second group of 'a's to create "aabaa".
 * No three consecutive characters are equal, so return "aabaa".
 * Example 3:
 *
 * Input: s = "aab"
 * Output: "aab"
 * Explanation: No three consecutive characters are equal, so return "aab".
 */
public class DeleteCharactersToMakeFancyString_1957 {
    public String makeFancyString(String s) {
        /**
         * захватывает любой символ с присвоением номера 1, //1 указывает на 1 группу захвата который должен повторятся 2 раза
         * ищет три и более подряда идущих одинаковых символов.
         * return s.replaceAll("(.)\\1{2,}", "$1$1");
         */

        char previous = s.charAt(0);
        int frequency = 1;
        var builder = new StringBuilder();
        builder.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == previous) {
                frequency++;
            } else {
                previous = s.charAt(i);
                frequency = 1;
            }
            if (frequency < 3){
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}