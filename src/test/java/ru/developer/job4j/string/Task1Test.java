package ru.developer.job4j.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    public void when3ElThenFound() {
        String[] strings = {"стол", "стул", "столица"};
        String expected = "ст";
        assertEquals(expected, Task1.maxMatch(strings));
    }

    @Test
    public void when4ElThenFound() {
        String[] strings = {"столовая", "стол", "столица", "столяр"};
        String expected = "стол";
        assertEquals(expected, Task1.maxMatch(strings));
    }

    @Test
    public void when1ElThenFound() {
        String[] strings = {"столовая"};
        String expected = "столовая";
        assertEquals(expected, Task1.maxMatch(strings));
    }

    @Test
    public void when3ElThenNotFound() {
        String[] strings = {"столовая", "стол", "апостол"};
        String expected = "";
        assertEquals(expected, Task1.maxMatch(strings));
    }

    @Test
    public void whenEmptyThenNotFound() {
        String[] strings = {};
        String expected = "";
        assertEquals(expected, Task1.maxMatch(strings));
    }
}