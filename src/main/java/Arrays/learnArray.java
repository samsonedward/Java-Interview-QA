package Arrays;

import java.util.Arrays;

public class learnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[] { 90, 20, 05, 109, 250, 22, 67, 34 };
		Arrays.sort(array);
		int length=array.length;
		System.out.println("Length of the Array is : "+length);
		for (int i = 0; i < array.length; i++) 
		{
			//System.out.println(+array[i]);
			System.out.println("Elements of array sorted in ascending order: " + array[i]);
		
		}
		
		String[] Names=new String[5];
		Names[0]="Samson Edward";
		Names[1]="Jason";
		Names[2]="Anandhi";
		Names[3]="Jayaraman";
		Names[4]="Kevin";
		 
		for (int i = 0; i < Names.length; i++) {
			System.out.println(Names[i]);	
		}
		
		for (String string : Names) {
			System.out.println(string);
		}
		
	}

}
