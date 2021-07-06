package StringsManipulation;

public class Learnstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S1 = "Samson";
		String S2 = new String("Edward");

		S1.toLowerCase();
		String str = S2.toUpperCase();

		System.out.println(S1.toLowerCase());
		System.out.println(str);

		int Len = S1.length();
		System.out.println("Length of the String is : " + Len);

		// Concatenate the two Strings
		String concat = S1 + S2;
		System.out.println("Concatenate the String is " + concat);

		String concats = S1.concat(S2);
		System.out.println("Concatenate the String is " + concats);

		String s1 = "			Java				";
		String s2 = new String("JAVA");
		
		//String compare by equals() method

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
		
		
		System.out.println(s1.contains("Java"));
		System.out.println(s1);
		
		//Java String trim() method 
		System.out.println(s1.trim());
		String trimreplace = s1.replace("a", "*");
		System.out.println(trimreplace);
		
		//Substring in Java using Index

		String name = "KevinSam";
		String ss1 = name.substring(5);
		System.out.println(ss1);
		String ss2 = name.substring(2, 5);
		System.out.println(ss2);

		for (int i = 0; i < name.length(); i++) {
			char Character = name.charAt(i);
			System.out.println(Character);
		}

	}

}
