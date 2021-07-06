package Javaprogram;

public class lengthofstring {

	public static void main(String[] args) {

		String str = "Welcome Corona";
		System.out.println("Enter the String:" + str);
		System.out.println("Length of the String:" + str.length());

		char[] Character = str.toCharArray();
		int length = 0;
		for (char c : Character) {
			length++;
		}
		System.out.println("Length of the Array:" + length);
	}

}
