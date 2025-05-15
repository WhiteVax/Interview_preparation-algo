package ru.developer.job4j.array_second;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClosedAreaCounterTest {
    @Test
    public void testCountClosedAreas() {
        ClosedAreaCounter closedAreaCounter = new ClosedAreaCounter();
        int[][] map = {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 0},
                {1, 1, 1, 1, 1}
        };

        int result = closedAreaCounter.countClosedAreas(map);
        assertEquals(1, result); // На карте 1 замкнутая область
    }

    @Test
    public void testNoClosedAreas() {
        ClosedAreaCounter closedAreaCounter = new ClosedAreaCounter();
        int[][] map = {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 0, 0},
                {0, 0, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };

        int result = closedAreaCounter.countClosedAreas(map);
        assertEquals(0, result); // На карте нет замкнутых областей, потому что все 0 связаны с границей
    }

    @Test
    public void testMultipleClosedAreas() {
        ClosedAreaCounter closedAreaCounter = new ClosedAreaCounter();
        int[][] map = {
                {1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 1, 1},
                {1, 0, 1, 0, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 1},
                {1, 1, 1, 1, 1, 1}
        };

        int result = closedAreaCounter.countClosedAreas(map);
        assertEquals(3, result); // На карте 2 замкнутые области
    }

    @Test
    public void testEmptyMap() {
        ClosedAreaCounter closedAreaCounter = new ClosedAreaCounter();
        int[][] map = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };

        int result = closedAreaCounter.countClosedAreas(map);
        assertEquals(0, result); // На карте нет замкнутых областей
    }
}