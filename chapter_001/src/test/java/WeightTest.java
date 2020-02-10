package ru.job4j.weight;
import org.junit.Assert;
import org.junit.Test;

public class WeightTest {
    @Test
    public void manWeight(){
        double in = 195;
        double expected = 109.24;
        double out = Weight.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight(){
        double in2 = 170;
        double expected2 = 69;
        double out2 = Weight.womanWeight(in2);
        Assert.assertEquals(expected2, out2, 0.01);
    }
}
