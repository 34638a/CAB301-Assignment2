package assignments.assignment2.jordan;

/**
 * Created by Jordan Laptop on 24/04/2018.
 */
public class BruteForceMedian {

	private static int opCounter = 0;
	private static long exTime = 0;
	private static int medianValue;


	public static void RunMedian(int[] inputArray) {
		long startTime;
		long endTime;
		medianValue = -1;

		System.out.println("Executing Median");

		startTime = System.nanoTime();
		medianValue = bruteForce(inputArray);
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
	 * Given any array of length n with the data type of primitive integer(32 bits long). Find the median of the array.
	 * @param dataIn The data to analyse for a median.
	 * @return float median value.
	 */
	public static int bruteForce(int[] dataIn) {
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

	/**
	 * Getter for property 'opCounter'.
	 *
	 * @return Value for property 'opCounter'.
	 */
	public static int getOpCounter() {
		return opCounter;
	}

	/**
	 * Getter for property 'exTime'.
	 *
	 * @return Value for property 'exTime'.
	 */
	public static long getExTime() {
		return exTime;
	}

	/**
	 * Getter for property 'medianValue'.
	 *
	 * @return Value for property 'medianValue'.
	 */
	public static int getMedianValue() {
		return medianValue;
	}
}
