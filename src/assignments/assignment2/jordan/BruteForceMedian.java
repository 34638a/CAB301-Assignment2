package assignments.assignment2.jordan;

/**
 * Created by Jordan Laptop on 24/04/2018.
 */
public class BruteForceMedian {

	private int opCounter = 0;
	private long exTime = 0;
	private int medianValue;

	/**
	 * Runs the median algorithm and prints the results.
	 * @param inputArray The sorted input array.
	 * @param printInput Print the input array to console.
	 * @param isOps Determines whether to run for time results or operations results.
	 */
	public void RunBruteForceMedian(int[] inputArray, boolean printInput, boolean isOps) {
		long startTime;
		long endTime;
		medianValue = -1;

		if (isOps) {
			System.out.println("Executing Median Ops");
			medianValue = bruteForceOps(inputArray);
		} else {
			System.out.println("Executing Median Time");
			startTime = System.currentTimeMillis();
			medianValue = bruteForceTime(inputArray);
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
	 * Given any array of length n with the data type of primitive integer(32 bits long). Find the median of the array.
	 * @param dataIn The data to analyse for a median.
	 * @return float median value.
	 */
	public int bruteForceOps(int[] dataIn) {
		int numsmaller = 0;
		int numequal = 0;
		int i = 0;
		int j = 0;
		final int k = dataIn.length/2;

		for (i = 0; i < dataIn.length; i++) {
			numsmaller = 0;
			numequal = 0;
			for (j = 0; j < dataIn.length; j++) {
				opCounter++;
				if (dataIn[i] > dataIn[j]) {
					numsmaller++;
				} else if (dataIn[i] == dataIn[j]) {
					opCounter++;
					numequal++;
				} else {
					opCounter++;
				}
			}

			opCounter++;
			if (numsmaller < k && k <= (numsmaller + numequal)) {
				return dataIn[i];
			}
		}

		return dataIn[0];
	}

	public int bruteForceTime(int[] dataIn) {
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
				} else {
				}
			}

			if (numsmaller < k && k <= (numsmaller + numequal)) {
				return dataIn[i];
			}
		}

		return dataIn[0];
	}

	/**
	 * Getter for property 'opCounter'.
	 *
	 * @return Value for property 'opCounter'.
	 */
	public int getOpCounter() {
		return opCounter;
	}

	/**
	 * Getter for property 'exTime'.
	 *
	 * @return Value for property 'exTime'.
	 */
	public long getExTime() {
		return exTime;
	}

	/**
	 * Getter for property 'medianValue'.
	 *
	 * @return Value for property 'medianValue'.
	 */
	public int getMedianValue() {
		return medianValue;
	}
}
