package ru.developer.leetcode.easy;

/**
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 * <p>
 * For example, "Hello World", "HELLO", "hello world hello world" are all sentences.
 * Words consist of only uppercase and lowercase English letters. Uppercase and lowercase English letters are considered different.
 * A sentence is circular if:
 * <p>
 * The last character of a word is equal to the first character of the next word.
 * The last character of the last word is equal to the first character of the first word.
 * For example, "leetcode exercises sound delightful", "eetcode", "leetcode eats soul" are all circular sentences.
 * However, "Leetcode is cool", "happy Leetcode", "Leetcode" and "I like Leetcode" are not circular sentences.
 * <p>
 * Given a string sentence, return true if it is circular. Otherwise, return false.
 * <p>
 * Example 1:
 * Input: sentence = "leetcode exercises sound delightful"
 * Output: true
 * Explanation: The words in sentence are ["leetcode", "exercises", "sound", "delightful"].
 * - leetcode's last character is equal to exercises's first character.
 * - exercises's last character is equal to sound's first character.
 * - sound's last character is equal to delightful's first character.
 * - delightful's last character is equal to leetcode's first character.
 * The sentence is circular.
 * <p>
 * Example 2:
 * Input: sentence = "eetcode"
 * Output: true
 * Explanation: The words in sentence are ["eetcode"].
 * - eetcode's last character is equal to eetcode's first character.
 * The sentence is circular.
 * <p>
 * Example 3:
 * Input: sentence = "Leetcode is cool"
 * Output: false
 * Explanation: The words in sentence are ["Leetcode", "is", "cool"].
 * - Leetcode's last character is not equal to is's first character.
 * The sentence is not circular.
 */
public class CircularSentence_2490 {
    public boolean isCircularSentence(String sentence) {
        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) {
            return false;
        }

        for (int i = 1; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                // пробел между словами нашли, по сторонам +1 -1 совпадения проверили, дальше пошли искать пробел
                if (sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }
}
