package Polymophism;

/*Method overriding is used to provide the specific implementation of a method which is already provided by its superclass. 
 * Method name have same name and parameter- Runtime polymorphism */

public class methodoverride {

	public void bike(String Bike_Name, String Bike_model, String Dualchannel_ABS) {
		System.out.println("Bike Name is	" + Bike_Name);
		System.out.println("Bike Model is	" + Bike_model);
		System.out.println("Bike Model is	" + Dualchannel_ABS);
	}

	public static void main(String[] args) {

		methodoverride obj = new methodoverride();
		obj.bike("Apache", "RTR", "DualChannel ABS");
		System.out.println();
		//obj.bike("Thunderbird", "RoyalEnfield", "ABS");
	}
}
