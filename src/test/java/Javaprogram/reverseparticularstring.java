package Javaprogram;

public class reverseparticularstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Reverse the string
		String str = "Oh my kadavulae";
		String Reversed = " ";
		String[] temp = str.split(" ");
		//System.out.println(temp.length);
		for (int i = temp.length - 1; i >= 0; i--) {
			Reversed = Reversed + temp[i] + " ";
		}
		System.out.println("Reverse the String using particular:" + Reversed);
	}

}
