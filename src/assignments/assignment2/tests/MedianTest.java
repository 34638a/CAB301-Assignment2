package assignments.assignment2.tests;

import assignments.assignment2.jack.Median;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MedianTest {
    @Test
    public void testMedianAlgorithmTimeNormalOdd() {
        int[] inputArray = {6, 32, 2, 91, 5, 56, 1}; //{1, 2, 5, >6<, 32, 56, 91}
        int medianValue = -1;

        Median median = new Median();
        median.RunMedian(inputArray, false, false);
        medianValue = median.getMedianValue();

        assertEquals(6, medianValue);
    }

    @Test
    public void testMedianAlgorithmTimeNormalEven() {
        int[] inputArray = {99, 6, 32, 2, 91, 5, 56, 1}; //{1, 2, 5, 6, >32<, 56, 91, 99}
        int medianValue = -1;

        Median median = new Median();
        median.RunMedian(inputArray, false, false);
        medianValue = median.getMedianValue();

        assertEquals(32, medianValue);
    }

    @Test
    public void testMedianAlgorithmTimeSame() {
        int[] inputArray = {5, 5, 5, 5, 5, 5, 5};
        int medianValue = -1;

        Median median = new Median();
        median.RunMedian(inputArray, false, false);
        medianValue = median.getMedianValue();

        assertEquals(5, medianValue);
    }


    @Test
    public void testMedianAlgorithmOpsNormalOdd() {
        int[] inputArray = {6, 32, 2, 91, 5, 56, 1}; //{1, 2, 5, >6<, 32, 56, 91}
        int medianValue = -1;

        Median median = new Median();
        median.RunMedian(inputArray, false, true);
        medianValue = median.getMedianValue();

        assertEquals(6, medianValue);
    }

    @Test
    public void testMedianAlgorithmOpsNormalEven() {
        int[] inputArray = {99, 6, 32, 2, 91, 5, 56, 1}; //{1, 2, 5, 6, >32<, 56, 91, 99}
        int medianValue = -1;

        Median median = new Median();
        median.RunMedian(inputArray, false, true);
        medianValue = median.getMedianValue();

        assertEquals(32, medianValue);
    }

    @Test
    public void testMedianAlgorithmOpsSame() {
        int[] inputArray = {5, 5, 5, 5, 5, 5, 5};
        int medianValue = -1;

        Median median = new Median();
        median.RunMedian(inputArray, false, true);
        medianValue = median.getMedianValue();

        assertEquals(5, medianValue);
    }
}
