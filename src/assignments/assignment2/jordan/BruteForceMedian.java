package assignments.assignment2.jordan;

import java.util.Arrays;

/**
 * Created by Jordan Laptop on 24/04/2018.
 */
public class BruteForceMedian {

	/*
	ALGORITHM BruteForceMedian(A[0..n − 1])
 // Returns the median value in a given array A of n numbers. This is
 // the kth element, where k = n 2, if the array was sorted.
 k ← n 2
 for i in 0 to n − 1 do
 numsmaller ← 0 // How many elements are smaller than A[i]
 numequal ← 0 // How many elements are equal to A[i]
 for j in 0 to n − 1 do
 if A[j] < A[i] then
 numsmaller ← numsmaller + 1
 else
 if A[j] = A[i] then
 numequal ← numequal + 1
 if numsmaller < k and k ≤ (numsmaller + numequal) then
 return A[i]
	 */



	/**
	 * Given any array of length n with the data type of primitive integer(32 bits long). Find the median of the array.
	 * @param dataIn The data to analyse for a median.
	 * @return float median value.
	 */
	private float bruteForce(int[] dataIn) {
		int numsmaller = 0;
		int numequal = 0;
		int i = 0;
		int j = 0;
		final int k = dataIn.length/2;

		for (i = 0; i < dataIn.length; i++) {
			numsmaller = 0;
			numequal = 0;
			for (j = 0; j < dataIn.length; j++) {
				if (dataIn[i] > dataIn[j]) {
					numsmaller++;
				} else if (dataIn[i] == dataIn[j]) {
					numequal++;
				}
			}
			if (numsmaller < k && k <= (numsmaller + numequal)) {
				return dataIn[i];
			}
		}

		return dataIn[0];
	}
}
