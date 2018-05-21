package assignments.assignment2.jack;

import static java.lang.Math.floor;

/**
 * Created by Jordan Laptop on 24/04/2018.
 * Authored by Jack
 */
public class Median {
    private int opCounter = 0;
    private long exTime = 0;
    private int medianValue;


    /**
     * Runs the median algorithm and prints the results.
     * @param inputArray The sorted input array.
     * @param printInput Print the input array to console.
     * @param isOps Determines whether to run for time results or operations results.
     */
    public void RunMedian(int[] inputArray, boolean printInput, boolean isOps) {
        long startTime;
        long endTime;
        medianValue = -1;

        if (isOps) {
            System.out.println("Executing Median Ops");
            medianValue = MedianAlgorithmOps(inputArray);
        } else {
            System.out.println("Executing Median Time");
            startTime = System.currentTimeMillis();
            medianValue = MedianAlgorithmTime(inputArray);
            endTime = System.currentTimeMillis();
            exTime = endTime - startTime;
        }

        if (printInput) {
            System.out.print("Input Array = ");
            for (int i = 0; i < inputArray.length; i++) {
                System.out.print(inputArray[i]);
                if (i != inputArray.length - 1) {
                    System.out.print(",");
                }
            }
        }

        System.out.println("Median Value = " + medianValue);
        if (isOps) {
            System.out.println("Op Count = " + opCounter);
        } else {
            System.out.println("Ex Time (milli) = " + exTime);
        }
        System.out.println();
    }


    /**
     * @implNote Basic operations version.
     * @param inputArray The sorted input array.
     * @return Returns the median value in a given array A of n numbers.
     */
    private int MedianAlgorithmOps(int[] inputArray) {
        Select select = new Select();
        int n = inputArray.length;

        opCounter++;    // If statement
        if (n == 1) {
            return inputArray[0];
        } else {
            int result = select.SelectAlgorithmOps(inputArray, 0, (int)floor(n/2), n-1);// Third argument rounds down
            opCounter += select.getOpCounter();
            return result;
        }
    }


    /**
     * @implNote Execution time version.
     * @param inputArray The sorted input array.
     * @return Returns the median value in a given array A of n numbers.
     */
    private int MedianAlgorithmTime(int[] inputArray) {
        Select select = new Select();
        int n = inputArray.length;

        if (n == 1) {
            return inputArray[0];
        } else {
            int result = select.SelectAlgorithmTime(inputArray, 0, (int)floor(n/2), n-1);// Third argument rounds down
            return result;
        }
    }


    /**
     * Getter for property 'opCounter'.
     * @return Value for property 'opCounter'.
     */
    public int getOpCounter() {
        return opCounter;
    }


    /**
     * Getter for property 'exTime'.
     * @return Value for property 'exTime'.
     */
    public long getExTime() {
        return exTime;
    }


    /**
     * Getter for property 'medianValue'.
     * @return Value for property 'medianValue'.
     */
    public int getMedianValue() {
        return medianValue;
    }
}
