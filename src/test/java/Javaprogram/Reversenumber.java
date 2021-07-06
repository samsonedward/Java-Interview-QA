package Javaprogram;

public class Reversenumber {

	public static void main(String[] args) {

		int num = 1005;
		int reversenum = 0;
		while (num != 0) {
			System.out.println("Enter the Number to be Reveresed:"+num);
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;
		}
	
		System.out.println("Reverse of specified number is: " + reversenum);

	}

}
