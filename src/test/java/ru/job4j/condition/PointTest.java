package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to21then1() {
        double expected = 1;
        Point a = new Point(1, 1);
        Point b = new Point(2, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1010to2010then10() {
        double expected = 10;
        Point a = new Point(10, 10);
        Point b = new Point(20, 10);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when33to55then2dot82() {
        double expected = 2.82;
        Point a = new Point(3, 3);
        Point b = new Point(5, 5);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when111to330then3() {
        double expected = 3;
        Point a = new Point(1, 1, 1);
        Point b = new Point(3, 3, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}