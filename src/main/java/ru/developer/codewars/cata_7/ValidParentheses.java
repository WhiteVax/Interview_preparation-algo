package ru.developer.codewars.cata_7;

/**
 *Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid.
 * The function should return true if the string is valid, and false if it's invalid.
 * Examples
 * "()"              =>  true
 * ")(()))"          =>  false
 * "("               =>  false
 * "(())((()())())"  =>  true
 *
 * Constraints
 * 0 <= length of input <= 100
 *     All inputs will be strings, consisting only of characters ( and ).
 *     Empty strings are considered balanced (and therefore valid), and will be tested.
 *     For languages with mutable strings, the inputs should not be mutated.
 */
public class ValidParentheses {
    public static boolean validParentheses(String parenStr) {
        return parenStr.chars()
                .reduce(0, (left, right) -> left < 0 ? left : right == '(' ? ++left : --left) == 0;
    }
}
