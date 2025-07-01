package ru.developer.job4j.list;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        if (index < 0 || index >= list.size() - 1) {
            list.remove(list.size() - 1);
            return list;
        }

        var temp = list.remove(list.size() - 1);
        list.set(index, temp);
        return list;
    }
}
