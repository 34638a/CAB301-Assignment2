package assignments.assignment2.tests;

import assignments.assignment2.jordan.BruteForceMedian;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BruteForceMedianTest {
    @Test
    public void testBFMedianAlgorithmTimeNormalOdd() {
        int[] inputArray = {6, 32, 2, 91, 5, 56, 1}; //{1, 2, 5, >6<, 32, 56, 91}
        int medianValue = -1;

        BruteForceMedian bruteForcemedian = new BruteForceMedian();
        bruteForcemedian.RunBruteForceMedian(inputArray, false, false);
        medianValue = bruteForcemedian.getMedianValue();

        assertEquals(6, medianValue);
    }

    @Test
    public void testBFMedianAlgorithmTimeNormalEven() {
        int[] inputArray = {99, 6, 32, 2, 91, 5, 56, 1}; //{1, 2, 5, >6<, 32, 56, 91, 99}
        int medianValue = -1;

        BruteForceMedian bruteForcemedian = new BruteForceMedian();
        bruteForcemedian.RunBruteForceMedian(inputArray, false, false);
        medianValue = bruteForcemedian.getMedianValue();

        assertEquals(32, medianValue);
    }

    @Test
    public void testBFMedianAlgorithmTimeSame() {
        int[] inputArray = {5, 5, 5, 5, 5, 5, 5};
        int medianValue = -1;

        BruteForceMedian bruteForcemedian = new BruteForceMedian();
        bruteForcemedian.RunBruteForceMedian(inputArray, false, false);
        medianValue = bruteForcemedian.getMedianValue();

        assertEquals(5, medianValue);
    }

    @Test
    public void testBFMedianAlgorithmOpsNormalOdd() {
        int[] inputArray = {6, 32, 2, 91, 5, 56, 1}; //{1, 2, 5, >6<, 32, 56, 91}
        int medianValue = -1;

        BruteForceMedian bruteForcemedian = new BruteForceMedian();
        bruteForcemedian.RunBruteForceMedian(inputArray, false, false);
        medianValue = bruteForcemedian.getMedianValue();

        assertEquals(6, medianValue);
    }

    @Test
    public void testBFMedianAlgorithmOpsNormalEven() {
        int[] inputArray = {99, 6, 32, 2, 91, 5, 56, 1}; //{1, 2, 5, >6<, 32, 56, 91, 99}
        int medianValue = -1;

        BruteForceMedian bruteForcemedian = new BruteForceMedian();
        bruteForcemedian.RunBruteForceMedian(inputArray, false, false);
        medianValue = bruteForcemedian.getMedianValue();

        assertEquals(32, medianValue);
    }

    @Test
    public void testBFMedianAlgorithmOpsSame() {
        int[] inputArray = {5, 5, 5, 5, 5, 5, 5};
        int medianValue = -1;

        BruteForceMedian bruteForcemedian = new BruteForceMedian();
        bruteForcemedian.RunBruteForceMedian(inputArray, false, false);
        medianValue = bruteForcemedian.getMedianValue();

        assertEquals(5, medianValue);
    }
}
