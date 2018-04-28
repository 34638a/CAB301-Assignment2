package assignments.assignment2.core;

import java.util.Random;

public class ArrayGeneration {
    /*
    Populate and Sort Array
    Input:
        The desired size of the array
        The max value of each element (exclusive)
    Output:
        An array of random sorted values
    Description:
        Creates, populates and sorts array.
    */
    public int[] PopulateSortArray(int arraySize, int maxValue) {
        return SortArray(PopulateArray(arraySize, maxValue));
    }


    /*
    Populate Array
    Input:
        The desired size of the array
        The max value of each element (exclusive)
    Output:
        An array of random unsorted values
    Description:
        Creates and populates a random array.
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


    /*
    Sort Array
    Input:
        An unsorted array
    Output:
        A sorted array
    Description:
        Sorts the given array.
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
