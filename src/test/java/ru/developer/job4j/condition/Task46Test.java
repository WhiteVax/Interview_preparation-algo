package ru.developer.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

public class Task46Test {
    public String ln = System.lineSeparator();

    @Test
    public void when17And25Then18And24() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task46.changeNums(17, 25);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("18").add("24");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }

    @Test
    public void when512And256Then511And257() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task46.changeNums(512, 256);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("511").add("257");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }

    @Test
    public void when100And100Then101And101() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task46.changeNums(100, 100);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("101").add("101");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }
}