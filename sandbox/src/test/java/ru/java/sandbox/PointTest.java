package ru.java.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import ru.java.sandbox.Point;


@Test
public class PointTest {
    public void testDistance() {
        Point p1 = new Point(1.4, 1.7);
        Point p2 = new Point(2.8, 2.5);
        Assert.assertEquals(Point.distance(p1, p2), 0); }
}


