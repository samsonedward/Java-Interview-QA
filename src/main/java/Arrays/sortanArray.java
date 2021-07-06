package Arrays;

import java.util.Arrays;

public class sortanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[] { 90, 20, 05, 109, 250, 22, 67, 34 };
		Arrays.sort(array);

		int desarray[] = new int[] { -2, -5, 50, 89, 6, 58, 90, 59, 99, -105, 63 };

		Arrays.sort(desarray);
		System.out.println();
		for (int i = 0; i < array.length; i++) {

			System.out.println("Elements of array sorted in ascending order: " + array[i]);
		}

		// Another Way

		/*
		 * Returns a string representation of the contents of the specified array. The
		 * string representation consists of a list of the array's elements,enclosed in
		 * square brackets
		 */

		System.out.println();
		System.out.println("Elements of array sorted in  descending order: " + Arrays.toString(desarray));
		System.out.println();
		System.out.println("Elements of array sorted in ascending order:" + Arrays.toString(array));

	}

}
