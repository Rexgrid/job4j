package ru.job4j.array;

import org.junit.Test;
import  static  org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenSwap2to1(){
        int[] input = {0,2,3,4};
        int[] expect = {0,3,2,4};
        int[] rst = SwitchArray.swap(input, 2,1);
        assertThat(rst, is(expect));
    }
    @Test
    public void when4to0(){
        int[] input = {0,1,2,3,4};
        int[] expect = {4,1,2,3,0};
        int[] rsl = SwitchArray.swap(input,4,0);
        assertThat(rsl, is(expect));
    }

}
