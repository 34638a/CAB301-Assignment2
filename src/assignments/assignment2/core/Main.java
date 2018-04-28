package assignments.assignment2.core;

import assignments.assignment2.jack.Median;

/**
 * Created by Jordan Laptop on 24/04/2018.
 */
public class Main {
    public static void main(final String[] args) {
        ArrayGeneration gen = new ArrayGeneration();
        Median median = new Median();

        median.RunMedian(gen.PopulateSortArray(10, 100));
    }
}
