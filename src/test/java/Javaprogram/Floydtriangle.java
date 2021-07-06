package Javaprogram;

import java.util.Iterator;
import java.util.Scanner;

public class Floydtriangle {

	public void patterns() {
		int row, column = 0;
		int numberoflines = 5;
		System.out.println("Enter the number of lines:" + numberoflines);
		for (row = 0; row < numberoflines; row++) {
			for (column = 0; column <= row; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void numbers() {
		//Scanner scanner = new Scanner(System.in);
		
		int number = 1, row, column;
		int limit=5;
		System.out.println("Enter the No of Rows:"+limit);
		//limit = scanner.nextInt();
		for (row = 0; row < limit; row++) {
			for (column = 0; column <= row; column++) {
				System.out.print(number + " ");
				number = number + 1;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		Floydtriangle patterns = new Floydtriangle();
		patterns.patterns();
		patterns.numbers();

	}
}