package Arrays;

public class Arrayprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaration and instantiation
		int arr[] = new int[5];
		int i = 0;

		// initialization

		arr[0] = 10;
		arr[1] = 10;
		arr[2] = 15;
		arr[3] = 20;
		arr[4] = 25;

		// Another way of Declaration//

		int arr1[] = { 10, 20, 30, 40, 50 };

		/* array length is the number of elements that an array can holds */

		for (i = 0; i < arr.length; i++)

			System.out.println("The Declaration of Arrays are " + arr[i]);
		System.out.println();
		{
			for (i = 0; i < arr1.length; i++)

				System.out.println("Directly values from another way of Arrays " + arr1[i]);
		}

	}

}
