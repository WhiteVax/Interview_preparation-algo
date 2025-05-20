package ru.developer.job4j.string;

/**
 * В этом задании необходимо реализовать парсинг HTTP лога.
 * Формат строки: уровень [поток] текст.
 * Например: WARNING [threads [zqfz [wbye [zfq]]] - 1] wqqa [e] zqw
 */
public class LogLine {
    public record Line(String level, String threads, String text) {
    }

    public Line parse(String text) {
        int lastIndexLevel = text.indexOf(' ');
        int lastIndexThreads = gerLastIndexThreads(text, lastIndexLevel + 1);

        return new Line(text.substring(0, lastIndexLevel),
                text.substring(lastIndexLevel + 1, lastIndexThreads),
                text.substring(lastIndexThreads + 1));
    }

    private int gerLastIndexThreads(String text, int start) {
        int rsl = 0;
        int count = 0;
        System.out.println(start);
        for (int i = start; i < text.length(); i++) {
            if (text.charAt(i) == '[') {
                count++;
            } else if (text.charAt(i) == ']') {
                count--;
            }
            if (count == 0) {
                rsl = i + 1;
                break;
            }
        }
        return rsl;
    }
}