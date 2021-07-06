package Javaprogram;

public class FindArrayElement {

	public static void main(String[] args) {

		//int[] array = { 2, 4, 6, 8, 10, 12 };
		int array[] = new int[] { 90, 20, 05, 109, 250, 22, 67, 34 };
		int arraynumber = 90;

		for (int number : array) {
			if (number == arraynumber) {
				System.out.println("Number is present:	" + number);
			} else {
				System.out.println("Number is not present:	" + number);
			}
		}
	}
}
