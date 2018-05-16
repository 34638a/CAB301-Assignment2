package assignments.assignment2.jack;

/**
 * Created by Jordan Laptop on 24/04/2018.
 * Authored by Jack
 */
public class Select {
    private int opCounter = 0;

    /**
     * @implNote Basic operation count version.
     * @param inputArray The sorted input array.
     * @param l Location to insert pivot value.
     * @param m Location of the middle.
     * @param h Index of n-1 element.
     * @return Returns the value at index m in array slice A[l..h], if the slice were sorted into nondecreasing order.
     */
    int SelectAlgorithmOps(int[] inputArray, int l, int m, int h) {
        Partition partition = new Partition();
        int pos = partition.PartitionAlgorithmOps(inputArray, l, h);
        opCounter += partition.getOpCounter();

        opCounter++;    // If statement
        if (pos == m) {
            opCounter++;    // If contents
            return inputArray[pos];
        } else if (pos > m) {
            opCounter++;    // If contents
            return SelectAlgorithmOps(inputArray, l, m, pos - 1);
        } else if (pos < m) {
            opCounter++;    // If contents
            return SelectAlgorithmOps(inputArray, pos + 1, m, h);
        } else {
            return -1;
        }
    }


    /**
     * @implNote Execution time version.
     * @param inputArray The sorted input array.
     * @param l Location to insert pivot value.
     * @param m Location of the middle.
     * @param h Index of n-1 element.
     * @return Returns the value at index m in array slice A[l..h], if the slice were sorted into nondecreasing order.
     */
    int SelectAlgorithmTime(int[] inputArray, int l, int m, int h) {
        Partition partition = new Partition();
        int pos = partition.PartitionAlgorithmTime(inputArray, l, h);

        if (pos == m) {
            return inputArray[pos];
        } else if (pos > m) {
            return SelectAlgorithmTime(inputArray, l, m, pos - 1);
        } else if (pos < m) {
            return SelectAlgorithmTime(inputArray, pos + 1, m, h);
        } else {
            return -1;
        }
    }


    /**
     * Getter for property 'opCounter'.
     * @return Value for property 'opCounter'.
     */
    int getOpCounter() {
        return opCounter;
    }
}
