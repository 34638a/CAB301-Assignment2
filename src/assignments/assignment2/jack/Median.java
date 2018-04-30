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
     */
    public void RunMedian(int[] inputArray) {
        long startTime;
        long endTime;
        medianValue = -1;

        System.out.println("Executing Median");

        startTime = System.nanoTime();
        medianValue = MedianAlgorithm(inputArray);
        endTime = System.nanoTime();
        exTime = endTime - startTime;

        System.out.print("Input Array = ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);
            if (i != inputArray.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println();
        System.out.println("Median Value = " + medianValue);
        System.out.println("Op Count = " + opCounter);
        System.out.println("Ex Time (ns) = " + exTime);
    }


    /**
     * @param inputArray The sorted input array.
     * @return Returns the median value in a given array A of n numbers.
     */
    private int MedianAlgorithm(int[] inputArray) {
        Select select = new Select();
        int n = inputArray.length;

        opCounter++;    // If statement
        if (n == 1) {
            opCounter++;    // If contents
            return inputArray[0];
        } else {
            opCounter++;    // If contents
            int result = select.SelectAlgorithm(inputArray, 0, (int)floor(n/2), n-1);// Third argument rounds down
            opCounter += select.getOpCounter();
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
