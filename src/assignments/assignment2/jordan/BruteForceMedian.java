package assignments.assignment2.jordan;

/**
 * Created by Jordan Laptop on 24/04/2018.
 */
public class BruteForceMedian {

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
