package StringsManipulation;

import java.util.Arrays;

public class LearnReplaceAll {
	public static void main(String[] args) {
		String str = "Good Morning";
		char[] strArray = str.toCharArray();
		String string = Arrays.toString(strArray);
		System.out.println(string);
		// for cntrl+spacebar and Enter
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
		}

		String str1 = "I,Love,Mutton,Biriyani";
		
		String[] str1Array = str1.split(",");
		System.out.println(Arrays.toString(str1Array));
		
		
		String str2 = "Born On 2010";
		System.out.println(str2.replace("n", "*"));
		System.out.println(str2.replaceAll("[^A-Z]", ""));
		System.out.println(str2.replaceAll(" ", ""));

	}
}
