package Constructors_Methods;

/*Constructor is block of code similar to method,constructor name and class name should be same;
 * A Constructor must have no explicit return type;
   A Java constructor cannot be abstract, static, final, and synchronized*/

public class defaultconstruc {

	// Default Constructor without Parameters//
	String defaultconstruc_name;
	int number;

	// Declared Method
	void anothermethod() {
		System.out.println("Return the Normal Method ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		defaultconstruc constr = new defaultconstruc();
		// calling a default constructor
		System.out.println("Return the Default Constructor :" + constr.defaultconstruc_name);
		System.out.println("Return the Default Constructor :" + constr.number);
		constr.anothermethod();

	}
}
