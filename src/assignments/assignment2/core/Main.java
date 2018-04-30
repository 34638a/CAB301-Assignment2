package assignments.assignment2.core;

import assignments.assignment2.jack.Median;
import assignments.assignment2.jordan.BruteForceMedian;

/**
 * Created by Jordan Laptop on 24/04/2018.
 */
public class Main {
    public static void main(final String[] args) {
        int maxValue = 1000;
        int numTrials = 10;
        int[] arraySizes = {1, 10, 100, 1000, 10000};

        RunMultipleMedian(numTrials, arraySizes, maxValue);
        //RunMultipleBruteForceMedian(numTrials, arraySizes, maxValue);
    }

    private static void RunMultipleMedian(int numTrials, int[] arraySizes, int maxValue) {
        ArrayGeneration gen = new ArrayGeneration();
        Median median = new Median();
        CSV csv = new CSV();

        int opCounter = 0;
        long exTime = 0;

        CreateCSV(csv, "median");

        for (int k = 1; k < arraySizes.length; k++) {
            System.out.println("\n//-----//\nTest Array Size of " + arraySizes[k]);
            for (int i = 0; i < numTrials; i++) {
                System.out.println("\nTest " + (i + 1) + " of " + numTrials);
                median.RunMedian(gen.PopulateSortArray(arraySizes[k], maxValue));

                opCounter = median.getOpCounter();
                exTime = median.getExTime();

                csv.addInt(arraySizes[k]);
                csv.addComma();
                csv.addInt(opCounter);
                csv.addComma();
                csv.addLong(exTime);
                csv.addComma();
                csv.addString("\n");
            }
        }
        csv.exportCSV();
        System.out.println("\n******************\nMedian experiment complete\n******************\n");
    }

    private static void CreateCSV(CSV csv, String name) {
        csv.createCSV(name);
        csv.addString("Array Size");
        csv.addComma();
        csv.addString("Operations");
        csv.addComma();
        csv.addString("Time");
        csv.addComma();
        csv.addString("\n");
    }
}
