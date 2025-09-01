package ru.developer.job4j.list;

import java.util.List;

/**
 *  Необходимо реализовать метод, который вернет список, основой которого будет первый, присутствовать элементы из второго
 * и точно отсутствовать элементы из третьего.
 */
public class SplitterList {
    public static List<String> split(List<String> left, List<String> middle, List<String> right) {
        left.retainAll(middle);
        left.removeAll(right);
        return left;
    }
}
