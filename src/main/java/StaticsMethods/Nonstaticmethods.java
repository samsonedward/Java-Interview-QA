package StaticsMethods;

public class Nonstaticmethods {

	/*Instance Variable*/
	
	String animal_name;
	String animal_type;

	/*Non Static Methods*/
	public void animal(String animal_name, String animal_type) {

		System.out.println("The animals are " + animal_name);
		System.out.println("The animals are " + animal_type);

	}

	public static void main(String[] args) {
		Nonstaticmethods obj = new Nonstaticmethods();
		obj.animal("Lion", "Carnivores");
		obj.animal("wolf", "Carnivores");
		System.out.println();
		obj.animal("Bears", "Omnivorous  ");
		obj.animal("Monkey", "Omnivorous  ");
		System.out.println();
		obj.animal("Cow", "herbivorous ");
		obj.animal("Elephant", "herbivorous ");

	}

}
