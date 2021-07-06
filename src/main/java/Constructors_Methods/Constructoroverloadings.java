package Constructors_Methods;

//Constructor overloading with different Parameter or Arguments , Constructor invoked Explicitly
//Constructor name class name should same

public class Constructoroverloadings {
	String name;
	String course;
	int year;

	Constructoroverloadings(String n, String c) {
		name = n;
		course = c;
	}

	Constructoroverloadings(String n, String c, int y) {
		name = n;
		course = c;
		year = y;
	}

	void objects() {
		System.out.println("Name of the Candidate :" + name);
		System.out.println("Which Course you preferred to choose:" + course);
		System.out.println("Which Year:" + year);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructoroverloadings s1 = new Constructoroverloadings("samson", "Selenium with Java");
		Constructoroverloadings s2 = new Constructoroverloadings("samson", "Selenium with Java", 2020);
		s1.objects();
		s2.objects();
	}

}
