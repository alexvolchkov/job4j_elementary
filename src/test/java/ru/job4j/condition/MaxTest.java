package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int expected = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax2To3To4Then4() {
        int first = 2;
        int second = 3;
        int third = 4;
        int expected = 4;
        int result = Max.max(first, second, third);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax2To3To4To5Then5() {
        int first = 2;
        int second = 3;
        int third = 4;
        int fourth = 5;
        int expected = 5;
        int result = Max.max(first, second, third, fourth);
        Assert.assertEquals(expected, result);
    }
}