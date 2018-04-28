package assignments.assignment2.jack;

/**
 * Created by Jordan Laptop on 24/04/2018.
 */
public class Select {
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

        if (pos == m) {
            return inputArray[pos];
        } else if (pos > m) {
            return SelectAlgorithm(inputArray, l, m, pos - 1);
        } else if (pos < m) {
            return SelectAlgorithm(inputArray, pos + 1, m, h);
        } else {
            return -1;
        }
    }
}
