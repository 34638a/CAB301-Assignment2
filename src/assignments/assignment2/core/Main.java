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

    /*
    Run Multiple Median
    Input:
        An integer value of the number of trials to run
        An array of the desired array sizes
        The maximum random element value to generate
    Output:
        N/A
    Description:
        Runs multiple median tests of varying array size. Prints the current test details to the console,
        adds the results and raw data to csv files and saves them in the project base directory.
    */
    private static void RunMultipleMedian(int numTrials, int[] arraySizes, int maxValue) {
        CSV csv = new CSV();
        CSV csvData = new CSV();

        int opCounter = 0;
        long exTime = 0;

        CreateCSV(csv, "median", "Operations", "Time");
        CreateCSV(csvData, "medianData", "Input Array", "Median Value");

        for (int k = 1; k < arraySizes.length; k++) {
            System.out.println("\n//-----//\nTest Array Size of " + arraySizes[k]);
            for (int i = 0; i < numTrials; i++) {
                System.out.println("\nTest " + (i + 1) + " of " + numTrials);

                // Initialise
                ArrayGeneration gen = new ArrayGeneration();
                Median median = new Median();
                int[] inputArray = gen.PopulateSortArray(arraySizes[k], maxValue);
                median.RunMedian(inputArray);

                // Grab the metrics
                opCounter = median.getOpCounter();
                exTime = median.getExTime();

                // Fill out results csv
                csv.addInt(arraySizes[k]);
                csv.addComma();
                csv.addInt(opCounter);
                csv.addComma();
                csv.addLong(exTime);
                csv.addComma();
                csv.addString("\n");

                // Fill out raw data csv
                csvData.addInt(arraySizes[k]);
                csvData.addComma();
                for (int j = 0; j < inputArray.length; j++) {
                    csvData.addInt(inputArray[j]);
                    csvData.addString(" ");
                }
                csvData.addComma();
                csvData.addLong(median.getMedianValue());
                csvData.addComma();
                csvData.addString("\n");
            }
        }
        csv.exportCSV();
        csvData.exportCSV();
        System.out.println("\n**************************\nMedian experiment complete\n**************************\n");
    }

    /*
    Create CSV
    Input:
        An instance of a CSV object
        The desired name of the CSV file
        The name of the first column heading
        The name of the second column heading
    Output:
        N/A
    Description:
        Initialises a CSV object and assigns a name and column headings.
    */
    private static void CreateCSV(CSV csv, String name, String headingOne, String headingTwo) {
        csv.createCSV(name);
        csv.addString("Array Size");
        csv.addComma();
        csv.addString(headingOne);
        csv.addComma();
        csv.addString(headingTwo);
        csv.addComma();
        csv.addString("\n");
    }

}
