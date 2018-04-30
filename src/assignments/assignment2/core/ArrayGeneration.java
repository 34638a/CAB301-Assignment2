package assignments.assignment2.core;

import java.util.Random;

/**
 * Created by Jack's Surface on 30/04/2018.
 * Authored by Jack
 */
public class ArrayGeneration {


    /**
     * Creates, populates and sorts array.
     * @param arraySize The size of the generated array.
     * @param maxValue The maximum value of each randomly generated element.
     * @return An array of random sorted values.
     */
    public int[] PopulateSortArray(int arraySize, int maxValue) {
        return SortArray(PopulateArray(arraySize, maxValue));
    }


    /**
     * Creates and populates a random array.
     * @param arraySize The size of the generated array.
     * @param maxValue The maximum value of each randomly generated element.
     * @return An array of random values.
     */
    private int[] PopulateArray(int arraySize, int maxValue) {
        int[] inputArray = new int[arraySize];
        Random random = new Random();

        //Populate test array
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = random.nextInt(maxValue);
        }

        return inputArray;
    }


    /**
     * Sorts the given array in ascending order.
     * @param inputArray An unsorted array.
     * @return A sorted array.
     */
    private int[] SortArray(int[] inputArray) {
        int n = inputArray.length;
        int count = n - 1;
        boolean sflag = true;
        do {
            sflag = false;
            for (int j = 0; j < count; j++) {
                if (inputArray[j + 1] < inputArray[j]) {
                    int third = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = third;
                    sflag = true;
                }
            }
            count = count - 1;
        } while (sflag);

        return inputArray;
    }
}
