package keywords;

/*this is a reference variable that refers to the current object*/
/*this Keyword  can be used to refer current class instance variable.
invoke current class method (implicitly) and invoke current class constructor.
passed as an argument in the method call and Constructor Call*/

public class keywordsproblem {

	/* Instance Variable */
	String mobile;
	String mobile_model;
	int price;

	/* Parameterized Constructor */
	keywordsproblem(String mobile, String mobile_model, int price) {

		this.mobile = mobile;
		this.mobile_model = mobile_model;
		this.price = price;

	}

	void showroom() {

		System.out.println("Mobile Brand:" + mobile);
		System.out.println("Mobile Brand:" + mobile_model);
		System.out.println("Price of the Mobile:" + price);
	}

	void mobileshowroom() {
		System.out.println();
		//Reference anotherr method not required this keyword-compiler will does
		showroom();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// object created//
		keywordsproblem problem = new keywordsproblem("Samsung", "Galaxy", 35000);
		// problem.showroom();
		problem.mobileshowroom();

	}

}
