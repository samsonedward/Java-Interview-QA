package StaticsMethods;

/*A static method belongs to the class rather than the object of a class.
 * A static method can be invoked without the need for creating an instance of a class.
 * A static method can access static data member and can change the value of it 
 *  static method can not use non static data member directly, This and Super Keyword cannot use Static */

public class StaticMethods {

	// Instance Variable*/
	String Employee_Name;
	int Emp_ID;

	/* Static Variable */
	static String Passport;

	/* Non Static Methods reference Static Variables */
	public void emp(String Employee_Name, int Emp_ID) {
		System.out.println("Enter the Employee Name:" + Employee_Name);
		System.out.println("Enter the Employee ID:" + Emp_ID);
		System.out.println("Enter the Password Details:" + Passport);
	}

	/* Static Methods */
	public StaticMethods() {

		Passport = "Passport";
		System.out.println("Declaring the static Methods:" + Passport);
	}

	public static void main(String[] args) {

		StaticMethods s1 = new StaticMethods();
		s1.emp("Duck", 0);
		System.out.println();
		s1.emp("Lion", 100);

	}

	
}
