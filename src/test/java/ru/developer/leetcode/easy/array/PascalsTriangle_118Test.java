package ru.developer.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangle_118Test {
    @Test
    public void when5Then5Lists() {
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1,1),
                List.of(1,2,1),
                List.of(1,3,3,1),
                List.of(1,4,6,4,1)
        );
        var pascalsTriangle = new PascalsTriangle_118();
        assertEquals(expected, pascalsTriangle.generate(5));
    }
}