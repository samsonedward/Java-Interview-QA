package Inheritence;

public class Employee {
	int emp_id;
	String Associate_Name;
	static String company_name = "Cognizant";

	void employee(int emp_id, String Associate_Name) {
		System.out.println("Associate EmployeeID	" + emp_id);
		System.out.println("Associate Name 		" + Associate_Name);
		System.out.println("Associated Company	" + company_name);
	}

}
