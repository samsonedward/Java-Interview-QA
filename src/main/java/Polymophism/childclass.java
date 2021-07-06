package Polymophism;

/*Static method cannot overridden*/ 

public class childclass extends methodoverride {

	public void bike(String Bike_Name, String Bike_model, String Dualchannel_ABS) {
		System.out.println("Bike Name is	" + Bike_Name);
		System.out.println("Bike Model is	" + Bike_model);
		System.out.println("Bike Model is	" + Dualchannel_ABS);
	}

	public static void main(String[] args) {

		childclass obj = new childclass();
		obj.bike("Pulsar", "NS", "SingleChannel ABS");
		
	}

}
