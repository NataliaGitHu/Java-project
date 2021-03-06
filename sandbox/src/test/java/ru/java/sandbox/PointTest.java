package ru.java.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class PointTest {
    // положительные числа
    @Test
    public void testDistance() {
        Point p1 = new Point(1.4, 1.7);
        Point p2 = new Point(2.8, 2.5);
        Assert.assertEquals(Point.distance(p1, p2), 1.6124515496597098);
    }

    // отрицательные числа
    @Test
    public void testDistance1() {
        Point p1 = new Point(-2.0, -3.0);
        Point p2 = new Point(-1.0, -7.0);
        Assert.assertEquals(Point.distance(p1, p2), 4.123105625617661);
    }

    // двузначные числа
     @Test
    public void testDistance3() {
        Point p1 = new Point(11.0, 25.0);
        Point p2 = new Point(10.0, 15.0);
        Assert.assertEquals(Point.distance(p1, p2), 10.04987562112089);
    }
}