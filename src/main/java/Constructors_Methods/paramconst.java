package Constructors_Methods;
/*The parameterized constructor is used to provide different values to distinct objects*/

public class paramconst {

	String manfact_car;
	String Car_model;
	double onroadprice;

	paramconst(String car, String model, double price) {
		manfact_car = car;
		Car_model = model;
		onroadprice = price;

	}

	public void aboutcars() {
		System.out.println("Manfacturer of the car		" + manfact_car);
		System.out.println("Model of the car		" + Car_model);
		System.out.println("Car Onroad Price in Lakhs	" + onroadprice);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		paramconst car = new paramconst("Baleno", "ZXI", 8.5);
		car.aboutcars();

		paramconst c1 = new paramconst("Tiago", "XZ", 700000);
		c1.aboutcars();

		paramconst c2 = new paramconst("Altroz", "XZ", 8500000);
		c2.aboutcars();
	}

}
