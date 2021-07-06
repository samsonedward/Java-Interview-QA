package StringsManipulation;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Welcome to Java";
		String s2 = "Java";
		String s3 = "JAVA";
		String s4 = "";

		// Java String charAt()-return one character in the given string
		char character = s1.charAt(2);
		System.out.println("Enter the String" + s1);
		System.out.println("Return the single Character of Index value:" + character);

		// Java String charAt()-return all the character one by one in the given string

		for (int i = 0; i < s1.length(); i++) {
			char character1 = s1.charAt(i);
			System.out.println("Return all the String Each characters:" + character1);
		}

		// Java String compareTo() method
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));

		// Concatenate the two Strings
		String concat = s1 + s2;
		System.out.println("Concatenate the String is " + concat);

		String concats = s1.concat(s2);
		System.out.println("Concatenate the String is " + concats);

		// Java String contains() method
		String contains = s1.concat(s2);
		System.out.println("String contain is :" + contains);
		// Verify the String
		Boolean iscontains = s1.contains("Welcome");
		System.out.println("Verify the given String contain is :" + iscontains);

		// Java String endsWith() method
		boolean endswidth = s1.endsWith("Java");
		System.out.println("Strings end with the Suffix:" + endswidth);

		// String compare by equals() method

		boolean equals = (s2.equals(s3));
		System.out.println("The given String are equals:" + equals);
		// Another method for compare the Strings using equals
		if (s1.equals(s3)) {
			System.out.println("both strings are equal");
		} else
			System.out.println("both strings are unequal");
		
		//Java String equalsIgnoreCase()
		boolean equalignore = (s2.equalsIgnoreCase(s4));
		System.out.println("The given String are equal:" + equalignore);
		
		//Java String indexOf() method
		System.out.println(s1.indexOf("to"));
		
		//Java String isEmpty() method    
		boolean empty=s4.isEmpty();
		System.out.println("The given string is Empty:"+empty);
		System.out.println(s4.isEmpty());
		
		//Java String join()
		 String joinString=s2.join("*","welcome","to","selenium");  
		System.out.println(joinString);
		
		//Java String lastIndexOf()
		int stringlast=s1.lastIndexOf("Java");
		System.out.println("The Last Index of the Last String :"+stringlast);
		
		//Java String length() method
		System.out.println("Length of the given String is :"+s1.length());
		
		 
		

	}
}
