package assignments.assignment2.jack;

/**
 * Created by Jordan Laptop on 24/04/2018.
 * Authored by Jack
 */
public class Partition {
    private int opCounter = 0;

    /*
    Partition Algorithm
    Input:
        A sorted array (Array[0...n-1])
        Location to insert pivot value
        Index of n-1 element
    Output:
        Returns the index at which the ‘pivot’ element formerly at location A[l] is placed.
    Description:
        Partitions array slice A[l..h] by moving element A[l] to the position
        it would have if the array slice was sorted, and by moving all
        values in the slice smaller than A[l] to earlier positions, and all values
        larger than or equal to A[l] to later positions. Returns the index at which
        the ‘pivot’ element formerly at location A[l] is placed.
    */
    int PartitionAlgorithm(int[] inputArray, int l, int h) {
        int pivotVal = inputArray[l];
        int pivotLoc = l;

        opCounter++;    // For loop
        for (int j = l + 1; j <= h; j++) {
            opCounter++;    // If statement
            if (inputArray[j] < pivotVal) {
                opCounter++;    // If contents - assignment
                pivotLoc = pivotLoc + 1;
                opCounter++;    // If contents - swap
                int thirdHand = inputArray[pivotLoc];
                inputArray[pivotLoc] = inputArray[j];
                inputArray[j] = thirdHand;
            }
            opCounter++;    // Swap
            int thirdHand = inputArray[l];
            inputArray[l] = inputArray[pivotLoc];
            inputArray[pivotLoc] = thirdHand;
        }
        opCounter++;    // Return
        return pivotLoc;
    }

    int getOpCounter() {
        return opCounter;
    }

    void resetOpCounter() {
        opCounter = 0;
    }
}
