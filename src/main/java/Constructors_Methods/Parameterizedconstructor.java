package Constructors_Methods;

/*The parameterized constructor is used to provide different values to distinct objects*/

public class Parameterizedconstructor   {

	// instance variable
	String bike;
	int Modelno;
	int price;

	// creating a parameterized constructor
	Parameterizedconstructor(String newbike, int Model_no, int new_price) {
		bike = newbike;
		Modelno = Model_no;
		price = new_price;

	}

	// method to display the values
	void bikes() {
		System.out.println("My Favourite bike is:" + bike);
		System.out.println("The Model of the bike model is:" + Modelno);
		System.out.println("The Onroad Price for the  bike is :" + price);
	}

	public static void main(String[] args) {

		// creating objects and passing values
		Parameterizedconstructor Param = new Parameterizedconstructor("Apache", 200, 150000);

		// calling method to display the values of object
		Param.bikes();

	}

}
