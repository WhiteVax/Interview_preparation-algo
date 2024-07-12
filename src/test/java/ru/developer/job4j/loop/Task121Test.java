package ru.developer.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class Task121Test {
    @Test
    void when20And321And452And58and5Then2And6And11And13And5() {
        String expected = "2 6 11 13 5" + System.lineSeparator();
        int[] array = new int[]{20, 321, 452, 58, 5};
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task121.loop(array);
        assertEquals(out.toString(), expected);
    }
}