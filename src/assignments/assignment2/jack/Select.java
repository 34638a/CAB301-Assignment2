package assignments.assignment2.jack;

/**
 * Created by Jordan Laptop on 24/04/2018.
 * Authored by Jack
 */
public class Select {
    private int opCounter = 0;

    /**
     * @param inputArray The sorted input array.
     * @param l Location to insert pivot value.
     * @param m Location of the middle.
     * @param h Index of n-1 element.
     * @return Returns the value at index m in array slice A[l..h], if the slice were sorted into nondecreasing order.
     */
    int SelectAlgorithm(int[] inputArray, int l, int m, int h) {
        Partition partition = new Partition();
        int pos = partition.PartitionAlgorithm(inputArray, l, h);
        opCounter += partition.getOpCounter();

        opCounter++;    // If statement
        if (pos == m) {
            opCounter++;    // If contents
            return inputArray[pos];
        } else if (pos > m) {
            opCounter++;    // If contents
            return SelectAlgorithm(inputArray, l, m, pos - 1);
        } else if (pos < m) {
            opCounter++;    // If contents
            return SelectAlgorithm(inputArray, pos + 1, m, h);
        } else {
            opCounter++;    // If contents
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
