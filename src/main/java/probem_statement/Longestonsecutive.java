package probem_statement;

import java.util.Arrays;

public class Longestonsecutive {

	public static void main(String[] args) {
		int[] array = { 15, 14, 7, 8, 9, 21, 17, 3, 4, 5, 6, 7, 8, 19 };
//    System.out.println("result is : " + countLongestConcecutive(array));

		int[] consArray = getLongestConsecutive(array);
		System.out.println("Longest consecutive array is: " + Arrays.toString(consArray));
		System.out.println("Longest consecutive length is: " + consArray.length);
		System.out.println("Max number in longest consecutive array is: " + consArray[consArray.length - 1]);
	}

	public static int[] getLongestConsecutive(int[] array) {
		// holds the maximum count of consecutive numbers
		int maxCount = 0;

		// temporary count of consecutive numbers
		int tempCount = 0;

		// holds the start index of maximum consecutive sequence
		int startIndex = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] - array[i] == 1) {
				// numbers are consecutive - increase the counter
				tempCount++;
			} else {
				// end of consecutive sequence
				if (maxCount < tempCount + 1) {
					// maintain the maximum count
					maxCount = tempCount + 1;

					// and its start index
					startIndex = i - tempCount;
				}
				// reset the temp count after end of consecutive sequence
				tempCount = 0;
			}
		}

		// final boundary condition - if consecutive number runs till the end of array
		if (maxCount < tempCount + 1) {
			maxCount = tempCount + 1;
			startIndex = array.length - 1 - tempCount;
		}

		// return the subset of the array
		return Arrays.copyOfRange(array, startIndex, startIndex + maxCount);
	}
}