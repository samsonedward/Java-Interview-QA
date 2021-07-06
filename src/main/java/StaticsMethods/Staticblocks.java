package StaticsMethods;

public class Staticblocks {

	/* Static Methods executed when the class is loaded in th memory before calling main method*/
	 
	static {
		System.out.println("Calling StaticMethod 1");
	}
	static {
		System.out.println("Calling StaticMethod 2");
	}

	void nonstaticmethod() {
		System.out.println("Calling Non Static Methods");
	}

	public static void main(String[] args) {
		System.out.println("Calling Main method");
		Staticblocks StaticMethods = new Staticblocks();
		StaticMethods.nonstaticmethod();

	}

}
