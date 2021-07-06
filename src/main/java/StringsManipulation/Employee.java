package StringsManipulation;

public class Employee {

	//Declared Access Modifier as public- Can access anywhere//
	
	public String Name = "Samson";
	String Eduction = "MCA";
	String Employee = "HCL";
	boolean ismarried = true;
	
	//Declared Access Modifier as private- Can access inside the class, Same package another class cant accessible//
	
	private long phone = 9884423492L;
	String Country = "india";
	 
	public static void main(String[] args) {	

		Employee employee = new Employee();
		System.out.println("The Name is :" + employee.Name);
		System.out.println("The Education is :" + employee.Eduction);
		System.out.println("The working is :" + employee.Employee);
		System.out.println("The ismarried is :" + employee.ismarried);
		System.out.println("The Phone is :" + employee.phone);
		System.out.println("The Country is :" + employee.Country);
 
		

	}

}
