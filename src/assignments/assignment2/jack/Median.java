package assignments.assignment2.jack;

import static java.lang.Math.floor;

/**
 * Created by Jordan Laptop on 24/04/2018.
 */
public class Median {
    /*
    Run Median
    Input:
        A sorted array (Array[0...n-1])
    Output:
        N/A
    Description:
        Runs the median algorithm and prints the results.
    */
    public void RunMedian(int[] inputArray) {
        int result = MedianAlgorithm(inputArray);

        System.out.println("Executing Median");
        System.out.print("Input Array = ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);
            if (i != inputArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("Median Value = " + result);
    }


    /*
    Median Algorithm
    Input:
        A sorted array (Array[0...n-1])
    Output:
        Median value
    Description:
        Returns the median value in a given array A of n numbers.
    */
    private int MedianAlgorithm(int[] inputArray) {
        Select select = new Select();
        int n = inputArray.length;

        if (n == 1) {
            return inputArray[0];
        } else {
            return select.SelectAlgorithm(inputArray, 0, (int)floor(n/2), n-1);  // Third argument rounds down
        }
    }
}
