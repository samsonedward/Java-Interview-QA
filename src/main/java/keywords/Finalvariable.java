package keywords;

/*Final Keyword restrict the user at Variable , Method and Class Level*/
/*Final Class cannot extends the class, Final Method cannot be overridden in the Subclass and Final Variable are constant cannot change*/

public final class Finalvariable {

	// blank final variable
	final int salary;
	final String Designation;

	//	Constructor 
	Finalvariable() {
		salary = 25000;
		Designation = "Business Analyst";
	}

	//Method
	void salary() {
		System.out.println(salary);
		System.out.println(Designation);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Finalvariable obj = new Finalvariable();
		obj.salary();
		new Finalvariable();

	}

}
