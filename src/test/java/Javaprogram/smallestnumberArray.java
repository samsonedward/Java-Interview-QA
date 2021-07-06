package Javaprogram;

import java.util.Arrays;

public class smallestnumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int smallest = Integer.MAX_VALUE;
		int givenArray[] = { 10, 20, 30, 40, 50 };
		int givenArrays[] = { 14, 16, 18, 3, 5, 7, 9, 2, 4, 6, 8, 10, 12, 56, 99 };
		Arrays.sort(givenArrays);
		System.out.println("The Smallest number in the Array is " + givenArrays[0]);
		
		//Another Way 
		for (int i = 0; i < givenArray.length; i++) {
			if (givenArray[i] < smallest)
				smallest = givenArray[i];
		}
		System.out.println("The Smallest number in the Array is " + smallest);

	}

}
