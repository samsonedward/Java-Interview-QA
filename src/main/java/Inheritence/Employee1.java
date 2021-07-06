package Inheritence;

public class Employee1 extends Employee {
	String Designation;
	String Department;

	void employee(String Designation, String Department) {
		System.out.println("Associate Designation	" + Designation);
		System.out.println("Associate Department 	" + Department);

	}

	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		
		e1.employee("Test Lead", "Automation Tester");
		e1.employee(251317, "Samson Edward");
		
		
		
		 
	}
}
