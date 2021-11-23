package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] excepted = {4, 2, 3, 1};
        Assert.assertArrayEquals(excepted, result);

    }

    @Test
    public void whenSwap1to3() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 1;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] excepted = {1, 4, 3, 2, 5};
        Assert.assertArrayEquals(excepted, result);

    }
}