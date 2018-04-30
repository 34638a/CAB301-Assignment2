package assignments.assignment2.jack;

/**
 * Created by Jordan Laptop on 24/04/2018.
 * Authored by Jack
 */
public class Select {
    private int opCounter = 0;

    /*
    Select Algorithm
    Input:
        A sorted array (A[0...n-1])
        Location to insert pivot value

        Index of n-1 element
    Output:
        Returns the value at index m in array slice A[l..h], if the slice
        were sorted into nondecreasing order.
    */
    int SelectAlgorithm(int[] inputArray, int l, int m, int h) {
        Partition partition = new Partition();
        int pos = partition.PartitionAlgorithm(inputArray, l, h);
        opCounter += partition.getOpCounter();
        partition.resetOpCounter();

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

    int getOpCounter() {
        return opCounter;
    }

    void resetOpCounter() {
        opCounter = 0;
    }
}
