package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in1 = 240;
        int expected1 = 4;
        int out1 = Converter.rubleToDollar(in1);
       Assert.assertEquals(expected1, out1);
    }

    @Test
    public void dollarToRubles() {
        int in2 = 5;
        int expected2 = 300;
        int out2 = Converter.dollarToRubles(in2);
        Assert.assertEquals(expected2, out2);
    }

    @Test
    public void euroToRubles() {
        int in3 = 8;
        int expected3 = 560;
        int out3 = Converter.euroToRubles(in3);
        Assert.assertEquals(expected3, out3);
    }
}
