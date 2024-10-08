package ru.developer.job4j.condition;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class Task78Test {
    public String ln = System.lineSeparator();

    @Test
    public void when223ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task78.divWithoutRemainder(223);
        String expected = "Таких чисел нет" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when222Then2And2And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task78.divWithoutRemainder(222);
        String expected = "2 2 2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when456Then4And6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task78.divWithoutRemainder(456);
        String expected = "4 6" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when100Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task78.divWithoutRemainder(100);
        String expected = "1" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}