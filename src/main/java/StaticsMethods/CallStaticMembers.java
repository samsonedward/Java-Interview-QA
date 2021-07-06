package StaticsMethods;

public class CallStaticMembers {

	public static void main(String[] args) {

		// Parentclassname objectname= new parentclassname

		LearnStatic obj = new LearnStatic();

		// Calling static Methods classname.staticmethods();

		LearnStatic.costlycars();

		// calling Nonstatic methods with currrent class objects
		obj.change();

	}

}
