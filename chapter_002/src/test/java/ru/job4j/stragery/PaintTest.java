package ru.job4j.stragery;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.junit.Assert.assertThat;
import  static org.hamcrest.core.Is.is;

public class PaintTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("++++")
                                .add("+     +")
                                .add("+     +")
                                .add("++++")
                                .toString()
                )
        );
    }
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                        .add("+")
                        .add("+ +")
                        .add("+++")
                        .toString()
                )
        );
    }
    @Test
    public void whenDrawSquare1() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("++++")
                                .add("+     +")
                                .add("+     +")
                                .add("++++")
                                .toString()
                )
        );
        System.setOut(stdout);
    }
    @Test
    public void whenDrawTriangle1() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("+")
                                .add("+ +")
                                .add("+++")
                                .toString()
                )
        );
        System.setOut(stdout);
    }
}
