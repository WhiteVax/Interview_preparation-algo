package ru.developer.job4j.list;

import org.assertj.core.data.Index;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class RepositionElementTest {

    private List<String> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
    }

    @Test
    void changePosition() {
        int index = 3;
        List<String> result = RepositionElement.changePosition(list, index);
        assertThat(result)
                .hasSize(8)
                .contains("nine")
                .doesNotContain("nine", Index.atIndex(8))
                .contains("nine", Index.atIndex(index));
    }

    @Test
    void changePositionNone() {
        int index = 20;
        List<String> result = RepositionElement.changePosition(list, index);
        assertThat(result)
                .hasSize(8)
                .doesNotContain("nine");
    }

    @Test
    void changePositionNone1() {
        int index = 8;
        List<String> result = RepositionElement.changePosition(list, index);
        assertThat(result)
                .hasSize(8)
                .doesNotContain("nine");
    }
}