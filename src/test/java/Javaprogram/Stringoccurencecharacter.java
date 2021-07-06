package Javaprogram;

public class Stringoccurencecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Malayalam";
		char findstr = 'a';
		char findstrs = 'm';
		int occurence = 0;
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == findstr)
				occurence = occurence + 1;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == findstrs)
				occurence = occurence + 1;
		}
		
		
		
		System.out.println(findstr + " is present	" + occurence + " number of times " + occurence);
		System.out.println(findstrs + " is present	" + occurence + " number of times " + occurence);
	}

}
