package Javaprogram;

public class Swaptwonumbers {

	public static void main(String[] args) {

		int number1 = 10;
		int number2 = 20;
		System.out.println("Enter the Number" + number1);
		System.out.println("Enter the Number" + number2);
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;

		System.out.println("*******************************");
		System.out.println("Swap the Number" + number1);
		System.out.println("Swap the Number" + number2);
	}

}
