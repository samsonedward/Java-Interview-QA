package Arrays;

import java.util.Arrays;

public class Duplicatenumbers {

	public void Duplicatenumbers() {
		int[] num = { 11, 2, 3, 45, 11, 79, 86, 3, 97, 21, 68, 79, 0, 0 };
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] == num[i + 1]) {
				System.out.println("Duplicate Numbers are: " + num[i]);
			}
		}
	}

	public void anotherway() {
		int[] num = { 0,0,1, 2, 3, 45, 11, 79, 86, 3, 97, 21, 68, 79,11,11 };
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println("Duplicate Number: " + num[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Duplicatenumbers duplicate = new Duplicatenumbers();
		duplicate.Duplicatenumbers();
		duplicate.anotherway();

	}

}
