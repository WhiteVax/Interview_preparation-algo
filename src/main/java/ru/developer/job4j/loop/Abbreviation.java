package ru.developer.job4j.loop;

/**
 * Аббревиатуры стали неотъемлемой частью нашей жизни. Мы очень часто используем и много какие выражения сокращаем,
 * забирая от каждого слова только первую букву - именно так формируются аббревиатуры.
 * Метод принимает строку, которая состоит из нескольких слов каждое из которых начинается с прописной буквы.
 * Необходимо из полученной строки сформировать аббревиатуру.
 */
public class Abbreviation {
    public static String collect(String s) {
        var builder = new StringBuilder();
        String[] words = s.split(" ");
        for(String str : words) {
            builder.append(str.charAt(0));
        }
        return builder.toString();
    }
}
