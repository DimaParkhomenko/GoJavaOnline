package test.module4.ex3_distance;

import org.junit.Assert;
import org.junit.Test;

public class CalculateDistanceTest {

    @Test(timeout = 3000)

    public void testDistanceBetweenTwoPoints() {
        int distanceForCheck = 4;

        CalculateDistance calculateDistance = new CalculateDistance();
        calculateDistance.setX1(5);
        calculateDistance.setX2(9);
        calculateDistance.setY1(8);
        calculateDistance.setY2(7);
        final int distance = calculateDistance.distanceBetweenTwoPoints();

        Assert.assertEquals(distanceForCheck, distance);
    }
}

