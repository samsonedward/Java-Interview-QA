package Javaprogram;

public class Reveresetring {

	public static void main(String[] args) {

		// Reverse the string using StringBuffer

		String str = "Learn Java";
		StringBuffer buffer = new StringBuffer();
		buffer.append(str);
		StringBuffer rev = buffer.reverse();
		System.out.println("Enter the String:" + str);
		System.out.println("Reverse the String using String Buffer:" + rev);

		// Reverse the string using StringBuilder

		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println("Reverse the string Using String Builder:" + sb);

		// Another way-Reverse the string using CharacterArray
		char[] CharacterArray = str.toCharArray();
		String Reversed = "";
		for (int i = CharacterArray.length - 1; i >= 0; i--) {
			Reversed = Reversed + CharacterArray[i];

		}
		System.out.println("Reverse the String using Character Array:" + Reversed);

	}

}
