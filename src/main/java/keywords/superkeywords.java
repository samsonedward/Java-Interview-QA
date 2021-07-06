package keywords;

/*Usage of Java super Keyword
super can be used to refer immediate parent class instance variable.
super can be used to invoke immediate parent class method.
super() can be used to invoke immediate parent class constructor*/

public class superkeywords extends thiskeywords {

	String Name = "Amazon";
	int salary = 50000;
	String location = "Bangalore";

	void getoffer() {	
		System.out.println("IBM Location:	 " + this.Name);
		System.out.println("IBM Salary:	 " + this.salary);
		System.out.println("IBM Location:	 " + this.location);
		System.out.println();
		getoffers();
	}

	void getoffers() { 

		System.out.println("IBM Salary:	 " + super.salary);
		System.out.println("IBM Location:	 " + super.location);
		System.out.println("IBM Location:	 " + super.Name);

	}

	public static void main(String[] args) {
		// TODO Auto-generated methoIbmofferd stub
		superkeywords offer = new superkeywords();
		offer.getoffer();

	}

}
