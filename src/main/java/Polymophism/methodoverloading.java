package Polymophism;

/*Method Name should be same but arguments are different. Different datatype. 
Compile Time polymphism, Private Methodscan be overloaded*/

public class methodoverloading {

	public void bike(String Bike_Name, String Bike_model) {
		System.out.println("Bike Name is" + Bike_Name);
		System.out.println("Bike Model is" + Bike_model);
	}

	// method names are same with different Parameters or Arguments

	public void bike(String Bike_Name, String Bike_model, String Dualchannel_ABS) {
		System.out.println("Bike Name is" + Bike_Name);
		System.out.println("Bike Model is" + Bike_model);
		System.out.println("Bike Model is" + Dualchannel_ABS);
	}

	// method names are same with different datatypes.

	public void bike(String Bike_Name, String Bike_model, int price) {
		System.out.println("Bike Name is" + Bike_Name);
		System.out.println("Bike Model is" + Bike_model);
		System.out.println("Bike Model is" + price);
	}

	public static void main(String[] args) {

		methodoverloading obj = new methodoverloading();
		obj.bike("Apache", "TVS");
		System.out.println();
		obj.bike("Yamaha", "FZ", "Dual Channel ABS");
		System.out.println();
		obj.bike("Pulsar NS", "Bajaj", 150000);

	}

}
