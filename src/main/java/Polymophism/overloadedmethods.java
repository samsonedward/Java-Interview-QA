package Polymophism;

public class overloadedmethods {

	/* Overloaded the Methods from the Parent Class methodoverloading */
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		// parentclassname objectname=new classname

		methodoverloading overload = new methodoverloading();
		overload.bike("Apache", "TVS");
		System.out.println();
		overload.bike("Yamaha", "FZ", "Dual Channel ABS");
		System.out.println();
		overload.bike("Pulsar NS", "Bajaj", 150000);

	}

}
