package Constructors_Methods;

public class Noargumentcons {

	String Car;
	int price;
	String Model_no;

	// constructor with no parameter or no Arguments Constructor

	public Noargumentcons() {
		Car = "Tiago";
		price = 60000;
		Model_no = "XZ";
		System.out.println("Specification of the Car:" + Car);
		System.out.println("Price of the Car:" + price);
		System.out.println("Specification Modelof the Car:" + Model_no);
	}

	public void display() {
		System.out.println("The Best car in the year 2020:");
	}

	public static void main(String[] args) {

		// calling the constructor without any parameter
		// ClassName ObjectName=new ConstructorName();

		Noargumentcons Noarg = new Noargumentcons();

		Noarg.display();

	}

}
