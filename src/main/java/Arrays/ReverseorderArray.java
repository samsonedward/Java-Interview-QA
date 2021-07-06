package Arrays;

import java.util.Arrays;

public class ReverseorderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 5, 15, 25, 35, 45 };

		// Reverse the Array //
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println("Reverse Array of the order Array " + arr[i]);
		}
		// position of the Array
		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}

	}
}
