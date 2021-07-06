package StaticsMethods;

/*Static keyword can declare a Variable, Method, Block and Nested Classes.
Do not create objects for accessing Static Variables and Static Methods*/

public class staticvariables {

	/* Instance Variable */
	int emp_id;
	String Associate_Name;

	/* StaticVariable */ 
	// The static variable can be used to refer to the common property of all// objects.
	static String company_name = "Cognizant";

	/* Access Variables in the Method */
	void employee(int emp_id, String Associate_Name) {
		System.out.println("Associate EmployeeID	" + emp_id);
		System.out.println("Associate Name 		" + Associate_Name);
		System.out.println("Associated Company	" + company_name);

	}

	public static void main(String[] args) {

		// Pass the values to the objects
		staticvariables s1 = new staticvariables();
		s1.employee(251317, "Samson Edward");
		System.out.println();
		s1.employee(251318, "Praveena");

	}

}
