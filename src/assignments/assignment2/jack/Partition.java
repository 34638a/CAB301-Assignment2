package assignments.assignment2.jack;

/**
 * Created by Jordan Laptop on 24/04/2018.
 * Authored by Jack
 */
public class Partition {
    private int opCounter = 0;


    /**
     * @implNote Basic operations version.
     * Partitions array slice A[l..h] by moving element A[l] to the position
     * it would have if the array slice was sorted, and by moving all
     * values in the slice smaller than A[l] to earlier positions, and all values
     * larger than or equal to A[l] to later positions.
     * @param inputArray The sorted input array.
     * @param l Location to insert pivot value.
     * @param h Index of n-1 element.
     * @return Returns the index at which the ‘pivot’ element formerly at location A[l] is placed.
     */
    int PartitionAlgorithmOps(int[] inputArray, int l, int h) {
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
        }
        opCounter++;    // Swap
        int thirdHand = inputArray[l];
        inputArray[l] = inputArray[pivotLoc];
        inputArray[pivotLoc] = thirdHand;
        return pivotLoc;
    }


    /**
     * @implNote Execution time version.
     * Partitions array slice A[l..h] by moving element A[l] to the position
     * it would have if the array slice was sorted, and by moving all
     * values in the slice smaller than A[l] to earlier positions, and all values
     * larger than or equal to A[l] to later positions.
     * @param inputArray The sorted input array.
     * @param l Location to insert pivot value.
     * @param h Index of n-1 element.
     * @return Returns the index at which the ‘pivot’ element formerly at location A[l] is placed.
     */
    int PartitionAlgorithmTime(int[] inputArray, int l, int h) {
        int pivotVal = inputArray[l];
        int pivotLoc = l;

        for (int j = l + 1; j <= h; j++) {
            if (inputArray[j] < pivotVal) {
                pivotLoc = pivotLoc + 1;
                int thirdHand = inputArray[pivotLoc];
                inputArray[pivotLoc] = inputArray[j];
                inputArray[j] = thirdHand;
            }
        }
        int thirdHand = inputArray[l];
        inputArray[l] = inputArray[pivotLoc];
        inputArray[pivotLoc] = thirdHand;
        return pivotLoc;
    }


    /**
     * Getter for property 'opCounter'.
     * @return Value for property 'opCounter'.
     */
    int getOpCounter() {
        return opCounter;
    }
}
